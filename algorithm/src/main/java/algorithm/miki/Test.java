package algorithm.miki;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @Auther: fujie.feng
 * @Date: 2019-03-13
 */
public class Test {

    private static Map<String, String> map;

    static {
        map = Maps.newHashMap();
        map.put("a", "13");
        map.put("b", "23");
        map.put("c", "34");
        map.put("d", "43");
        map.put("e", "43");
        map.put("com.miki", "true");
    }

    public static boolean getFlag() {
        String s = map.get("com.miki");
        return StringUtils.isBlank(s) ? false : Boolean.valueOf(s);
    }

    public static void main(String[] args) {

        System.out.println(Test.getFlag());
    }
}
