import java.util.Scanner;

public class Longestrun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int n = sc.nextInt(),count = 0,max = 0;
        int[] a = new int[n];
        for(int i = 0; i <n; i++){
            System.out.print("Enter "+ (i+1) +" Number: ");
            int n2 = sc.nextInt();
            a[i] = n2;
        }
        for(int i = 0; i <(n-1); i++) {
        if(a[i] == a[i + 1]){
            count++;
            if(count > max){
                max = count;
            }
        }else count =0;
        }
        System.out.println("Max repitions are: " +(max+1));
        }
}

