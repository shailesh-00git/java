
class Factorial {

    static int fact(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);

        }
    }
}

public class RecursionDemo {

    public static void main(String[] args) {
        int x = 5;
        int result = Factorial.fact(x);
        System.out.println("factorial:" + result);
    }
}
