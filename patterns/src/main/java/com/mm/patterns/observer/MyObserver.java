package com.mm.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * 基于jdk的Observer实现
 */
public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    /**
     * @param o 观察对象
     * @param arg 传递的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " 观察对象：" + o);
        System.out.println("参数：" + arg);
    }

}
