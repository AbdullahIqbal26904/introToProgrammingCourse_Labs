public class Exercise7 {
    public static void main(String[] args){
        int[][] b = toMatrix(7);
        printCoinsMatrix(b);
    }
    public static int[][] toMatrix(int n){
        String a = "";
        int count=0;
        while(n != 0){
            if(n % 2 == 0){
                a = "0" + a;
                count++;
            }else{
                a = "1" + a;
                count++;
            }
            n = n/2;
        }
        for(int i=0; i < (7-count);i++){
            a = "0" +a;
        }
        int c = Integer.parseInt(a);
        int[][] arr = new int[3][3];
        for(int i=2; i >=0;i--){
            for(int x=2; x >=0;x--){
                arr[i][x]= c%10;
                c /= 10;
            }
        }
        return arr;
    }
    public static void printCoinsMatrix(int[][] b){
        for(int i=0; i <b.length;i++){
            for(int x=0 ; x<b[0].length;x++){
                if(b[i][x] == 0){
                    System.out.print("H ");
                }else{
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
    }
}
