import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        String a = "";
       while(n != 0){
           if(n % 2 == 0){
               a = "0" + a;
           }else{
               a = "1" + a;
           }
           n = n/2;
       }
        System.out.print(a);
    }
}
