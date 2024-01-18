public class Exercise6 {
    public static boolean SudokuCheck(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int x=0; x<a[0].length; x++){
                int temp = a[i][x];
                    for(int z=x+1; z<a[0].length; z++){
                        if(temp == a[i][z]){
                            return false;
                        }
                        for(int c=i+1; c<a.length; c++){
                            if(temp == a[c][x]){
                                return false;
                            }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] a = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9} };
        StdOut.print(SudokuCheck(a));
    }
}
