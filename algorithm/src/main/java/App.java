import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;


/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class App {

    private static int a = 0;

    private static volatile int b = 0;

    public static class IntegerTest implements Runnable {

        private int i;

        public IntegerTest(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            b = i;
        }
    }



    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + a);
            a = 1;
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + a);
            if (a == 1) {
                a = 2;
            }
        }).start();

        Thread.sleep(300);
        System.out.println(a);
    }

}
