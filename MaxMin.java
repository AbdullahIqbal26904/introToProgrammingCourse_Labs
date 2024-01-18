import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int n = sc.nextInt();
        int max = 0, min = 1000;
        int[] a = new int[n];
            for(int i = 0; i <n; i++){
                System.out.print("Enter "+ (i+1) +" Number: ");
                int n2 = sc.nextInt();
                a[i] = n2;
        }
        for(int i = 0; i <n; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Largest number enter is: "+max);
        System.out.println("Smallest number enter is: "+min);

    }
}
