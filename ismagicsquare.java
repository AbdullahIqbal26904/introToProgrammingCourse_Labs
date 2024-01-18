public class ismagicsquare {
    public static void main(String[] args) {
        double sum = 0;
        double sum2 = 0;

        double[][] b = {{2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}};
        if (b.length == b[0].length) {
            for (int i = 0; i < b.length; i++) {
                sum = sum + b[i][i];
            }
            int j = b.length;
            for (int i = (0); i < b.length; i++) {
                j = j - 1;
                sum2 = sum2 + b[i][j];

            }
            if (sum == sum2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }else{
            System.out.println(false);
        }
    }
}