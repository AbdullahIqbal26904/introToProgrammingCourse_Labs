import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long N = sc.nextLong();

        for (int i = 2; i <= N / i; i++) {
            while (N % i == 0) {
                N /= i;
                if (N > 1) {
                    System.out.println(i);
                }
            }

        }
    }
}
