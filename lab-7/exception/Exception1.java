import java.util.Random;

class Exception1 {
  public static void main(String[] args) {
    String[] users = { "ram", "shyam", "hari" };
    Random rand = new Random();
    try {
      String user = users[rand.nextInt(5)];
      System.out.println("User found!" + user);
    } catch (Exception e) {
      System.out.println("Warning: User not found. Please check the index and try again.");
    }
  }
}