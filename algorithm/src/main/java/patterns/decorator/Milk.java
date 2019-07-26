package patterns.decorator;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 3;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " with milk";
    }
}
