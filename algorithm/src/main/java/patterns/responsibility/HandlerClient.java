package patterns.responsibility;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class HandlerClient {

    public static Map<Integer, Handler> map = Maps.newHashMap();

    static {
        map.put(1, new PreSellOrderHandler(1));
        map.put(2, new NormalOrderHandler(2));
    }


    public static void init() {
        List<Integer> keys = Lists.newArrayList(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            Handler handler = map.get(key);

            if (i < keys.size() - 1) {
                int nextKey = keys.get(i + 1);
                if (nextKey != 0) {
                    Handler nextHandler = map.get(nextKey);
                    handler.setNextHandler(nextHandler);
                }
            }
        }
    }

}
