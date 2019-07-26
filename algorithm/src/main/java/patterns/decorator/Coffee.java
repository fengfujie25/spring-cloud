package patterns.decorator;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class Coffee implements Drink {

    @Override
    public float cost() {
        return 100;
    }

    @Override
    public String getDesc() {
        return "it`s coffee";
    }
}
