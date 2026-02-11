class getCharsDemo {
  public static void main(String[] args) {
    String s = "This is demo of the get chars method .";
    int start = 10;
    int end = 14;
    char[] buff = new char[end - start];
    s.getChars(start, end, buff, 0);
    System.out.println(buff);
  }
}