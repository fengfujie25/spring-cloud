package patterns.adapter;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class AndroidCharger implements TypeCInterFace {
    @Override
    public void typec() {
        System.out.println(" android use typec ");
    }
}
