package patterns.responsibility;

import org.springframework.beans.factory.InitializingBean;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class PreSellOrderHandler extends Handler implements InitializingBean {


    public PreSellOrderHandler(int priority) {
        super(1);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerClient.map.put(1, this);

    }

    @Override
    protected void currentHandler(Order order) {
        System.out.println("presell order handler is start");
    }
}
