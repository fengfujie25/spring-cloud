package patterns.responsibility;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class Order {

    private int id;

    private String name;

    private int priority;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
