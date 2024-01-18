import java.util.Scanner;

public class Maxones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of integers you want to enter: ");
        int count = 0,i,max = 0,n = sc.nextInt();
        boolean found = false;
        double n2;
        double[] a;
        a = new double[n];
        for( i = 0;i <n;i ++){
            System.out.print("Enter "+ (i+1)+ "Number: ");
            n2 = sc.nextInt();
            a[i] = n2;
        }
        i = 0;
      for(int c =0; c < n ; c++){
          if(a[i] == 0){
              count = 0;
          }else count++;
          if (count > max){
              max = count;
          }
          i++;
      }
        System.out.println(max);
    }
}
