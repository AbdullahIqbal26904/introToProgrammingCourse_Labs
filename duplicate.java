import java.util.Scanner;

public class duplicate {
    public static void main(String[] args){
        int[] a = { 2, 5, 7, 1, 1, 3, 6, 1, 5, 4, 1, 3};
        int count = 0;

        for(int i = 0; i <12 ; i++){
            int x = a[i];
            count = 0;
            for(int u = 0; u <12 ; u++) {
                if(x == a[u]){
                    count++;
                }
                if(count == 2){
                    break;
                }
            }
            if(count > 1){
                System.out.println("This array contains duplicate value of: " + x);
                break;
            }
            }

    }
}
