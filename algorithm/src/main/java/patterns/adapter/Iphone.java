package patterns.adapter;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class Iphone {
    private Lightning lightning;

    public Iphone(Lightning lightning) {
        this.lightning = lightning;
    }

    public void charge() {
        System.out.println("ip 充电");
        lightning.lightning();
        System.out.println("ip 充电结束");
    }
}
