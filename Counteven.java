import java.util.Scanner;

public class Counteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int n = sc.nextInt(),n2,even = 0;
        int[] a;
        a = new int[n];
        for(int i = 0;i <n;i ++){
            System.out.print("Enter "+ (i+1)+ "Number: ");
            n2 = sc.nextInt();
            a[i] = n2;
        }
        for(int i = 0;i <n;i ++){
            if(a[i]%2 == 0){
                even = even + 1;
            }
        }
        System.out.println("Number of even entered are: "+even);
        }
}
