package isEven;

public class PingPong {
    public static boolean isEven(int num) {
        return odd(num);
    }

    private static boolean even(int num) {
        if(num == 0)
            return true;
        return !odd(num-1);
    }

    private static boolean odd(int num) {
        if(num == 0)
            return true;
        return !even(num-1);
    }
}
