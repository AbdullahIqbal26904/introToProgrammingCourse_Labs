public class Transpose {
    public static void main(String[] args){
        int[][] a = { {2, 5, 7},
                      {1, 3, 6},
                      {5, 4, 1},
                      {0 , 8 , 2}};
        int[][] b = new int[3][4];
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 3; x++){
                b[x][i] = a[i][x];
            }
        }
        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 4; x++){
               System.out.print( b[i][x] + " ");
            }
            System.out.println();
        }
    }
}
