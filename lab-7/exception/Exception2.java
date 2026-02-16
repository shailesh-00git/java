import java.util.Random;

public class Exception2 {
  public static void main(String[] args) {
    int[] numbers = { 100, 200, 300, 400, 500 };
    Random random = new Random();

    try {

      int CurrVal = numbers[random.nextInt(5)]; // Randomly selects a number from the array
      System.out.println("Selected value: " + CurrVal);

      try {
        int divisor = random.nextInt(5); // Generates 0, 1, or 2
        System.out.println("Dividing " + CurrVal + " by " + divisor + "...");
        int result = CurrVal / divisor;
        System.out.println("Result: " + result);
      } catch (Exception e) {
        System.out.println(e);
      }

    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("--- Division finished  ---");
  }
}