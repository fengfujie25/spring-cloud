package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-17
 */
public class LockDemo {

    private static volatile int index = 0;

    private static Lock lock = new ReentrantLock();

    public static class Inncr implements Runnable{

//        Integer i;
//
//        public AddThread(Integer i) {
//            this.i = i;
//        }




        @Override
        public void run() {
            try {
                Thread thread = new Thread();
                lock.lock();
                index++;
                System.out.println(thread.getName() + ":" + index);
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new Inncr()).start();
        }
    }
}
