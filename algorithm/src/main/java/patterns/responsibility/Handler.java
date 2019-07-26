package patterns.responsibility;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public abstract class Handler {

    private Handler nextHandler;

    private int priority;

    public Handler(int priority) {
        this.priority = priority;
    }

    /**
     * set next handler
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handler(Order order) {
        if (order == null) throw new RuntimeException("order is null");

        if (priority == 0) throw new IllegalArgumentException("priority is 0");

        if (priority == order.getPriority()) {
            this.currentHandler(order);
        } else {
            if (this.nextHandler != null) {
                nextHandler.handler(order);
            } else {
                throw new RuntimeException("handler is null");
            }
        }
    }

    protected abstract void currentHandler(Order order);
}
