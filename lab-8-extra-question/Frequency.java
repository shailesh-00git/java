// a program to count the highest frequency of a character i  a string
class Frequency {
  public static void main(String[] args) {
    int[] arr = new int[127];
    String str = "hello world";
    for (int i = 0; i < str.length(); i++) {
      arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
    }
    int max = -1;
    char ch = ' ';
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
        ch = (char) i;
      }
    }
    System.out.println(str);
    System.out.println("Character with highest frequency: " + ch + " Frequency: " + max);
  }
}