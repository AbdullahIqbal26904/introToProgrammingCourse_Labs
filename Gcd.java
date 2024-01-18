import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values:- ");
        int n1 = sc.nextInt(),n2 = sc.nextInt(),x=1,max = 0;
        while (x <= n1 && x <= n2){
            if(n1 % x == 0 && n2 % x == 0){
                if(x > max){
                    max = x;
                }
            }
            x++;
        }
        System.out.print(max);
    }
    }
