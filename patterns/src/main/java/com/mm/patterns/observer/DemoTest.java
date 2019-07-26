package com.mm.patterns.observer;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-26
 */
public class DemoTest {

    public static void main(String[] args) {
        MyObserveable myObserveable = new MyObserveable();

        MyObserver myObserver1 =  new MyObserver("Test1");
        MyObserver myObserver2 =  new MyObserver("Test2");
        MyObserver myObserver3 =  new MyObserver("Test3");

        myObserveable.addObserver(myObserver1);
        myObserveable.addObserver(myObserver2);
        myObserveable.addObserver(myObserver3);

        myObserveable.toSendObserver("I Changed message ......");
        //删除一个观察者
        myObserveable.deleteObserver(myObserver3);
        System.out.println("-----------------------------------------");
        myObserveable.toSendObserver("I Changed message too.............");
    }
}
