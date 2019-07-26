package algorithm;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-04
 */
public class ForkJoinPoolDemo {

    public static void main(String[] args) throws Exception {
        final ExecutorService pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, null);
        list.parallelStream().forEachOrdered(System.out::println);

//        pool.submit(() -> {
//           list.stream().forEach(System.out::println);
//        });
//        TimeUnit.SECONDS.sleep(2);
//        pool.shutdown();

//        pool.execute(() -> {
//            list.parallelStream().map(a->a.toString()).collect(Collectors.toList());
//        });
//        pool.submit(() -> {
//            list.parallelStream().map(a -> a.toString()).collect(Collectors.toList());
//        }).get();
//        TimeUnit.SECONDS.sleep(3);
    }
}
