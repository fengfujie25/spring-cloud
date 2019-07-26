package patterns.adapter;


import java.lang.reflect.InvocationTargetException;

/**
 * 适配器模式
 *
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class DemoTest {
    public static void main(String[] args) throws Exception {
        Adapter adapter = new Adapter(new AndroidCharger());
        Iphone iphone = new Iphone(adapter);
        iphone.charge();
    }
}
