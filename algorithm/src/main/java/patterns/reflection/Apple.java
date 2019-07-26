package patterns.reflection;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class Apple {

    private String color;

    public void print() {
        System.out.println("apple is red");
    }

    public void print(String color) {
        System.out.println("apple is " + color);
    }

    private void print(int num) {
        System.out.println(num + ", apple is here");
    }
}
