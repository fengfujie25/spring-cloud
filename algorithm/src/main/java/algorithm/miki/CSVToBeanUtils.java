package algorithm.miki;

import algorithm.entity.CSVMikiHotelInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import javafx.util.Pair;
import org.apache.commons.io.input.BOMInputStream;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CSVToBeanUtils {

    private static final String FILE_PATH = "/Users/fengfujie/Downloads/YMLX_MIKI_ENCODE.zip";
//    private static final String FILE_PATH = "/Users/fengfujie/Downloads/Miki_Product_0625.zip";
//    private static final String FILE_PATH = "/Users/fengfujie/文档/qunar/test2.zip";

    private ExecutorService executorService = Executors.newFixedThreadPool(1);

    /**
     * 解析csv文件并转成bean
     *
     * @param clazz 类
     * @param <T>   泛型
     * @return 泛型bean集合
     */
    public <T> List<T> getCsvData(Class<T> clazz) {
        List<T> list = Lists.newArrayList();

        ZipInputStream zipInputStream = null;
        BufferedReader bufferedReader = null;
        InputStream inputStream = null;
        InputStreamReader in = null;
        CsvToBean<T> csvToBean = null;
        try {
            File file = new File(FILE_PATH);
            String unicode = EncodeUtil.getEncode(FILE_PATH, false);
            inputStream = new FileInputStream(file);

            zipInputStream = new ZipInputStream(inputStream, Charset.defaultCharset());
            ZipEntry zipEntry = null;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
//                bufferedReader = new BufferedReader(new InputStreamReader(new BOMInputStream(zipInputStream), "utf-8"));
                bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream, "utf-8"));
//                String unicodes = EncodeUtil.getEncode(bis, false);
                CSVReader reader = new CSVReader(bufferedReader);


                HeaderColumnNameMappingStrategy<T> strategy = new HeaderColumnNameMappingStrategy<>();
                strategy.setType(clazz);

                csvToBean = new CsvToBeanBuilder<T>(reader)
                        .withSeparator(',')
                        .withQuoteChar('\'')
                        .withMappingStrategy(strategy).build();
                list.addAll(csvToBean.parse());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (zipInputStream != null)
                    zipInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }


    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        CSVToBeanUtils csvToBeanUtils = new CSVToBeanUtils();

        List<CSVMikiHotelInfo> csvMikiHotelInfoList = csvToBeanUtils.getCsvData(CSVMikiHotelInfo.class);
        int index = 0;
        for (CSVMikiHotelInfo csvMikiHotelInfo : csvMikiHotelInfoList) {
            if (StringUtils.isBlank(csvMikiHotelInfo.getProductCode())) {
                System.out.println(index);
            }
            index++;
        }
//        Set<CSVMikiHotelInfo> set = Sets.newHashSet();
//        set.addAll(csvMikiHotelInfoList);
//        csvMikiHotelInfoList.clear();
//        csvMikiHotelInfoList.addAll(set);
//
//        AtomicInteger i = new AtomicInteger(1);
//        csvMikiHotelInfoList.forEach((a) -> {System.out.println(i + ":" + a.getProductName());
//        i.getAndIncrement();});
//        System.out.println(System.currentTimeMillis() - t1);
    }
}
