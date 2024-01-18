import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int i;
        String a;
        a = "";
        for (i = 1; i <= n; i++) {
            a = a +"* ";
        }
        for (i = 1; i <= n; i++) {
            System.out.println(a);
        }
    }
}
