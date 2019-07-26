package patterns.decorator;

/**
 * 装饰者模式
 *
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class DemoTest {

    public static void main(String[] args) {
        Drink coffee = new Coffee();
        System.out.println(coffee.getDesc() + ", cost=" + coffee.cost());
        coffee = new Milk(coffee);
        System.out.println(coffee.getDesc() + ", cost=" + coffee.cost());
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDesc() + ", cost=" + coffee.cost());
    }
}
