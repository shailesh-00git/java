// a program to count the highest frequency of a character i  a string
class Frequency {
  public static void main(String[] args) {
    int[] arr = new int[127];
    String str = "hello worldaaaaa";
    for (int i = 0; i < str.length(); i++) {
      arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
    }
    int i=0       ;
    int max = arr[i];
    char ch = ' ';
    for ( i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
        ch = (char) i;
      }
    }
    System.out.println(str);
    System.out.println("Character with highest frequency: " + ch + " Frequency: " + max);
  }
}