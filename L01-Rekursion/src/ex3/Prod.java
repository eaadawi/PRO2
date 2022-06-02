package ex3;

public class Prod {
    public static void main(String[] args) {
        System.out.println(prod(4, 3));
        System.out.println(prodRus(4, 3));
    }

    public static int prod(int a, int b){
        int result;
        if(a == 0){
            return 0;
        }else if(a == 1){
            return b;
        }else{
            result = prod((a-1), b)+b;
        }
        return result;
    }

    public static int prodRus(int a, int b){
        int result;
        if(a == 0){
            return 0;
        }else if(a%2 == 0 && a >= 2){
            result = prodRus((a/2), (2*b));
        }else {
            result = prodRus((a-1), b)+b;
        }
        return result;
    }


}
