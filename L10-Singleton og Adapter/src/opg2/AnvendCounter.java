package opg2;

public class AnvendCounter {
    public static void main(String[] args) {
        System.out.println(Counter.getInstance().getValue() + " = 0");

        Counter.getInstance().count();
        System.out.println(Counter.getInstance().getValue() + " = 1");

        Counter.getInstance().count();
        Counter.getInstance().times2();
        System.out.println(Counter.getInstance().getValue() + " = 4");

        Counter.getInstance().zero();
        System.out.println(Counter.getInstance().getValue() + " = 0");
    }

}
