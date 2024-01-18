import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n ; i++){
            b[i] = i;
        }
        // shuffle
        int a = b.length;
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            int temp = b[i];
            b[i] = b[r];
            b[r] = temp;
        }

        for(int i = 0; i < n ; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        //print
        int x =0;
        for(int y = 0; y < n; y++) {
            for (x = 0; x < n; x++) {
                if(x == b[y]){
                 System.out.print("Q ");
                }else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
