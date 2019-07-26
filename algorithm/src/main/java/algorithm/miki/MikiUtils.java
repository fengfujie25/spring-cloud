package algorithm.miki;

import algorithm.entity.MikiHotelInfo;
import com.google.common.collect.Lists;


import java.io.*;
import java.util.List;
import java.util.zip.ZipInputStream;

public class MikiUtils {

    private static final String FILE_PATH = "/Users/fengfujie/Downloads/YMLX_MIKI.zip";

    /**
     * 读取zip
     *
     * @return
     */
    public static List<String> readZip() throws Exception {
        List<String> list = Lists.newArrayList();
        String str = "";
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        ZipInputStream zipInputStream = null;
        boolean success = false;
        int times = 0;

        do {
            try {
                File file = new File(FILE_PATH);
                inputStream = new FileInputStream(file);
                zipInputStream = new ZipInputStream(inputStream);

                zipInputStream.getNextEntry();

                bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream, "utf-8"));
                while ((str = bufferedReader.readLine()) != null) {

                    list.add(str);
                    success = true;
                }
            } finally {
                inputStream.close();
                bufferedReader.close();
                zipInputStream.close();
            }
            times++;
        } while (!success && times <= 30);
        return list;
    }

    public List<MikiHotelInfo> getMikiHotelInfo(List<String> list) {
//        List<MikiHotelInfo> mikiHotelInfoList = Lists.newArrayList();
//        list.remove(0);
//        list.forEach((str) -> {
//            MikiHotelInfo mikiHotelInfo = JsonUtil.toBean(str, MikiHotelInfo.class);
//            if (mikiHotelInfo != null)
//                mikiHotelInfoList.add(mikiHotelInfo);
//        });
//        return mikiHotelInfoList;
        return null;
    }

    public static void main(String[] args) throws Exception {
        MikiUtils mikiUtils = new MikiUtils();
        List<String> list = MikiUtils.readZip();
        List<MikiHotelInfo> mikiHotelInfoList = mikiUtils.getMikiHotelInfo(list);

        System.out.println("00");
    }
}
