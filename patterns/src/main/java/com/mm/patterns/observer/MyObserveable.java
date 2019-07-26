package com.mm.patterns.observer;

import java.util.Observable;

/**
 * 被观察的对象
 * @auther: fujie.feng
 * @DateT: 2019-07-26
 */
public class MyObserveable extends Observable {

    /**
     * 要给观察者的信息
     * @param message
     */
    public void toSendObserver(String message) {
        //标注这个对象已经改变，
        setChanged();

        notifyObservers(message);
    }
}
