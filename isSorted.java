import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int i,n = sc.nextInt();
        boolean isSorted = true;
        double n2;
        double[] a;
        a = new double[n];
        for( i = 0;i <n;i ++){
            System.out.print("Enter "+ (i+1)+ "Number: ");
            n2 = sc.nextInt();
            a[i] = n2;
        }
        i = 0;
        while(isSorted){
            if(a[i] > a[i+1]){
                isSorted = false;
            }
            i++;
            if(i >= (n - 1)){
                break;
            }
        }
        System.out.println("Is array sorted: " + isSorted);

    }
}
