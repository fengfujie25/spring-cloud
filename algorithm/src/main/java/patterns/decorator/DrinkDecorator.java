package patterns.decorator;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public abstract class DrinkDecorator implements Drink{

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String getDesc() {
        return drink.getDesc();
    }
}
