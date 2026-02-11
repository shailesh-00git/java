package mypack;

public class AccountBalance {
  public static void main(String[] args) {
    Balance[] current = new Balance[4];
    current[0] = new Balance("anish", 213);
    current[1] = new Balance("asha", 13);
    current[2] = new Balance("hari", 3214);
    current[3] = new Balance("om", 441498);

    for (int index = 0; index < current.length; index++) {
      current[index].show();
    }

  }

}
