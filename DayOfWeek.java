import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter day:- ");
        int n2 = sc.nextInt();
        System.out.print("Enter year:- ");
        int n3 = sc.nextInt();

        int y = n3 - (14 - n1)/12;
        int x = y + y/4 - y/100 +y/400;
        int m = n1 + 12* ((14 - n1)/12)-2;
        int d = (n2 + x + (31*m)/12)% 7;

        if(d == 0){
            System.out.println("Sunday");
        }
        if(d == 1){
            System.out.println("Monday");
        }if(d == 2){
            System.out.println("Tuesday");
        }if(d == 3){
            System.out.println("Wednesday");
        }if(d == 4){
            System.out.println("Thursday");
        }if(d == 5){
            System.out.println("Friday");
        }else System.out.println("Saturday");

    }
}
