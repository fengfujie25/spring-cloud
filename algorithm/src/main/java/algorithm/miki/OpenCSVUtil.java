package algorithm.miki;

import algorithm.entity.CSVMikiHotelInfo;
import algorithm.entity.CSVMikiHotelInfoExt;
import com.google.common.collect.Lists;
import com.opencsv.bean.CsvToBeanBuilder;
import io.micrometer.core.instrument.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-26
 */
public class OpenCSVUtil {

    //    private static final String FILE_PATH = "/Users/fengfujie/Downloads/Miki_Product_0625.zip";
    private static final String FILE_PATH = "/Users/fengfujie/Downloads/YMLX_MIKI_ENCODE.zip";

//    private static final String FILE_PATH = "/Users/fengfujie/Downloads/test1.zip";

    private String filePath;

    private Class clssz;

    public static List<CSVMikiHotelInfo> readCsv() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);

            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream, Charset.defaultCharset());
            ZipEntry zipEntry = null;
            List<CSVMikiHotelInfo> beans = Lists.newArrayList();
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                Reader reader = new InputStreamReader(zipInputStream, Charset.defaultCharset());
                beans.addAll(new CsvToBeanBuilder<CSVMikiHotelInfo>(reader).withType(CSVMikiHotelInfo.class).withSeparator(',').build().parse());
            }
            System.out.println(Charset.defaultCharset());
            return beans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> readCsvFile(Class<T> clssz) {
        if (StringUtils.isBlank(FILE_PATH)) return null;
        FileInputStream fileInputStream = null;
        ZipInputStream zipInputStream = null;
        ZipEntry zipEntry = null;
        Reader reader = null;
        List<T> list = Lists.newArrayList();
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
            zipInputStream = new ZipInputStream(fileInputStream, Charset.defaultCharset());
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                reader = new InputStreamReader(zipInputStream, Charset.defaultCharset());
                list.addAll(new CsvToBeanBuilder<T>(reader).withType(clssz).build().parse());
            }
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<CSVMikiHotelInfo> readCsvNew() {
        List<CSVMikiHotelInfo> list = Lists.newArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);

            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream, Charset.defaultCharset());

            ZipEntry zipEntry = null;
            Reader reader = null;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {

                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                byte[] buffer = new byte[1024];
                int length;
                while ((length = zipInputStream.read(buffer)) > 0) {
                    byteArrayOutputStream.write(buffer, 0, length);
                }

                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());


                reader = new InputStreamReader(byteArrayInputStream, Charset.defaultCharset());
                list.addAll(new CsvToBeanBuilder<CSVMikiHotelInfo>(reader).withType(CSVMikiHotelInfo.class).build().parse());
            }


        } catch (Exception e) {
            e.getStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<CSVMikiHotelInfo> list = OpenCSVUtil.readCsv();
        list.stream().filter(a -> StringUtils.isBlank(a.getProductCode())).filter(a -> StringUtils.isBlank(a.getLatitude()) || StringUtils.isBlank(a.getLongitude())).collect(Collectors.toList());

        System.out.println(list.size());

//        int sum = 0;
//        int index = 0;
//        List<CSVMikiHotelInfoExt> list = OpenCSVUtil.readCsvFile(CSVMikiHotelInfoExt.class);
//        for (CSVMikiHotelInfoExt csvMikiHotelInfo : list) {
//            if (StringUtils.isBlank(csvMikiHotelInfo.getProductCode())) {
//                sum++;
//                System.out.println(index);
//            }
//            index++;
//        }
//        System.out.println(sum);
//        System.out.println(12247 - 4247);
    }
}
