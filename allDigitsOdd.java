import java.util.Scanner;

public class allDigitsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int odd = 0,even = 0,x,n = sc.nextInt();
        boolean complete = false, allodd = false;
        while(!complete){
            x = n % 10;
            if(x % 2 != 0){
                odd = odd + 1;
            }
            else {
                even = even + 1;

            }
                n = n/10;
            if(n == 0) complete = true;
        }
        if(even == 0){
            allodd = true;
        }
        System.out.println("> java allDigitsOdd "+ allodd);
    }
}
