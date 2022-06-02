package opg2;

public class Counter {
    private int value;

    private volatile static Counter uniqueInstance = new Counter();

    private Counter() {
        value = 0;
    }

    public static Counter getInstance() {
        if(uniqueInstance == null) {
            synchronized (Counter.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Counter();
                }
            }
        }
        return uniqueInstance;
    }

    public void count() {
        value++;
    }

    public void times2() {
        value *= 2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
