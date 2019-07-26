import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;


/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class App {


    private static List<String> list = Lists.newArrayList("aa", "22", "44", "a1", "a2");

    public static void main(String[] args) {
        Optional<String> result = list.stream().filter(s -> s.startsWith("a")).reduce((s1, s2) -> s1 + "," + s2);

        result.ifPresent(System.out::println);
        System.out.println(result.toString());

        System.out.println(App.tableSizeFor(17));

        System.out.println(2 & App.hash(10));
        System.out.println(App.hash(11));

    }

    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public static final int tableSizeFor(int cap) {
        int n = cap - 1;

        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


}
