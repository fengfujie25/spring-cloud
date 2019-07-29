import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class App {


    public static void main(String[] args) throws InterruptedException {

        Set<Short> s = Sets.newHashSet();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove((short)(i - 1));
        }
        System.out.println(s.size());

    }

}
