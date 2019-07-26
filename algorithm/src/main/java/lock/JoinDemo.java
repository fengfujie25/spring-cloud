package lock;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-17
 */
public class JoinDemo {

    public static class ThreadDemo extends Thread {

        private Thread pre;

        private int i;

        public ThreadDemo(Thread pre, int i) {
            this.pre = pre;
            this.i = i;
        }

        @Override
        public void run() {
            try {
                pre.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("num:" + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            ThreadDemo threadDemo = new ThreadDemo(thread, i);
            new Thread(threadDemo).start();
            thread = threadDemo;
        }
    }
}
