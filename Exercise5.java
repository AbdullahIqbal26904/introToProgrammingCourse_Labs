public class Exercise5 {

    private static boolean finder(int[][] hill, int sum,int[][]p , int i, int j) {

        if (sum==0) {
            p[i][j]=1;
            return true;
        }
        p[i][j]=1;
        boolean a=false,b=false,c=false,d=false;
        if (i>0 && p[i-1][j]==0 && sum-hill[i][j]>=0) a = finder(hill, sum - hill[i][j], p, i - 1, j);
        if (i<hill.length-1 && p[i+1][j]==0&& sum-hill[i][j]>=0) b = finder(hill, sum - hill[i][j], p, i + 1, j);
        if (j>0 && p[i][j-1]==0&& sum-hill[i][j]>=0) c = finder(hill, sum - hill[i][j], p, i, j - 1);
        if (j<hill[i].length-1 && p[i][j+1]==0&& sum-hill[i][j]>=0) d = finder(hill, sum - hill[i][j], p, i, j + 1);
        else p[i][j]=0;
        return a||b||c||d;

    }
    public static boolean findSum(int[][] mat , int sum , int[][]path){
        return findSum(mat,sum,path,0,0);
    }
    private static boolean findSum(int[][] m, int sum, int[][] p, int i, int j) {
        if (i>=m.length || j>= m[i].length) return false;


        boolean a = finder(m,sum-m[i][j],p,i,j);
        boolean b = findSum(m,sum,p,i+1,j);
        boolean c = findSum(m,sum,p,i,j+1);

        if (a) return true;
        else if (b) return true;
        return c;
    }


    public static void main(String[] args){
        int[][] p = {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        int [][] hill = {{3,8,7,1},
                {5,15,2,4},
                {12,14,-13,22},
                {13,16,17,52}};
        for(int i=0; i<p.length; i++){
            for(int c=0; c<p[0].length; c++){
                StdOut.println(p[i][c]);
            }
        }
    }
}
