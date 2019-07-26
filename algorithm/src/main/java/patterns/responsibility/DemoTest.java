package patterns.responsibility;


import java.util.Map;

/**
 * 责任链模式
 *
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */

public class DemoTest {

    public static void main(String[] args) {

        HandlerClient.init();

        Map<Integer, Handler> handlerMap = HandlerClient.map;

        if (handlerMap.isEmpty()) throw new RuntimeException("handler map is null");

        Handler handler = null;

        for (Map.Entry<Integer, Handler> entry : handlerMap.entrySet()) {
            handler = entry.getValue();
            if (handler != null) break;
        }

        Order presellOrder = new Order();
        presellOrder.setPriority(1);
        handler.handler(presellOrder);


        Order normOrder = new Order();
        normOrder.setPriority(2);
        handler.handler(normOrder);

    }
}
