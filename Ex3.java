import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int r =(int) (Math.random()*10);
        while(n != r){
            if(n > r){
                System.out.println("Too high , try again");
            }else{
                System.out.println("Too low , try again");
            }
            System.out.print("Enter Number: ");
            int n2 = sc.nextInt();
            n = n2;
        }
        System.out.println("Value Found");
    }
    }
