
class Main {

    public static void main(String[] args) {
        int jarray[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int sum;

        for (int i = 0; i < jarray.length; i++) {
            sum = 0;
            for (int j = 0; j < jarray[i].length; j++) {
                sum = sum + jarray[i][j];

            }
            System.out.print("sum = " + sum);
        }
    }
}
