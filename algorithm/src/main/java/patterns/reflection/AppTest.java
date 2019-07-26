package patterns.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class AppTest {

    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("patterns.reflection.Apple");
        Method method = clazz.getMethod("print", String.class);


        Method method1 =clazz.getMethod("print");
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();

        method.invoke(obj, "blue");
        method1.invoke(obj);

        Field[] fields = clazz.getFields();
        Arrays.stream(fields).forEach(a -> System.out.println(a.getName()));

        Field[] fields1 = clazz.getDeclaredFields();
        Arrays.stream(fields1).forEach(a -> System.out.println(a.getName()));
    }
}
