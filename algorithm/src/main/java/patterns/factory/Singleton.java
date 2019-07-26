package patterns.factory;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单利模式
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class Singleton {
    private static final AtomicReference<Singleton> INSTANCE = new AtomicReference<Singleton>();

    private Singleton() {

    }

    public static Singleton getInstance() {
        for (; ; ) {
            Singleton singleton = INSTANCE.get();
            if (singleton != null) return singleton;
            singleton = new Singleton();
            if (INSTANCE.compareAndSet(null, singleton)) return singleton;
        }
    }


    public enum SingletonEnum {
        INSTANCE;

        public void whateverMethod() {

        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 19; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    Singleton singleton = Singleton.getInstance();
                    Thread thread = new Thread();
//                    System.out.println(thread.getName() + "_" + singleton);
//                    SingletonEnum singletonEnum = SingletonEnum.INSTACE;
                    Singleton singleton = Singleton.getInstance();
                    System.out.println(thread.getName() + "_" + singleton);
                }
            }, "this").start();
        }

    }
}
