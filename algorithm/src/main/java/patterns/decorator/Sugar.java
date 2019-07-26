package patterns.decorator;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-16
 */
public class Sugar extends DrinkDecorator {
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "with sugar";
    }
}
