public class Matrixadd {
    public static void main(String[] args){
        int[][] a = { {2, 5, 7, 1}, {1, 3, 6, 1}, {5, 4, 1, 3} };
        int[][] b = { {1, 9, 5, 0}, {7, 1, 5, 4}, {3, 4, 2, 8} };
        int[][] c = new int[3][4];
        for(int i = 0; i <3; i++) {
            for (int x = 0; x < 4; x++) {
                c[i][x] = a[i][x] + b[i][x];
            }
        }
        for(int i = 0; i <3; i++) {
            for (int x = 0; x < 4; x++) {
                System.out.println(c[i][x]);
            }
        }
    }
}
