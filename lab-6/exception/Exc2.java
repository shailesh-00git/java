package exception;

// handling using try catch
public class Exc2 {
    static void main() {
        int n =12;
        int d =0;
        try{
            System.out.println(n/d);
        } catch (Exception e) {
            System.out.println("Something is wrong"+e);
        }
        System.out.println("After catch statement");
    }

}
