package patterns.responsibility;

import org.springframework.beans.factory.InitializingBean;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class NormalOrderHandler extends Handler implements InitializingBean {
    public NormalOrderHandler(int priority) {
        super(2);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerClient.map.put(2, this);
    }

    @Override
    protected void currentHandler(Order order) {
        System.out.println("norm order hanlder is start");
    }
}
