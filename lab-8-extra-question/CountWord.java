// a projram to count the number of words in java
class CountWord {
  public static void main(String[] args) {
    String str = "Hello, I am from Nepal";
    String[] words = str.split(" ");
    System.out.println(str);
    System.out.println("There are " + words.length + " words in the string.");
  }
}