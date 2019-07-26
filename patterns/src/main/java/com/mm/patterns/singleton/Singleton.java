package com.mm.patterns.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单利
 * 基于AtomicReference实现的单利模式
 * @auther: fujie.feng
 * @DateT: 2019-07-26
 */
public class Singleton {

    private static AtomicReference<Singleton> INSTANCE = new AtomicReference<>();

    private Singleton(){};

    public static Singleton getInstance() {
        for ( ; ;) {
            Singleton singleton = INSTANCE.get();
            if (singleton != null) {
                return singleton;
            }
            singleton = new Singleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);
            }).start();
        }
    }
}
