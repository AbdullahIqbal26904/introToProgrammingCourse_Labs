import java.util.Scanner;

public class circles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of circles: ");
        int n1 = sc.nextInt();
        System.out.print("Enter probability  of black circles: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter minimum radius of circles: ");
        double n3 = sc.nextDouble();
        System.out.print("Enter maximum radius of circles: ");
        double n4 = sc.nextDouble();
        for(int i = 1; i <= n1; i++){
            double z = n3+ (Math.random()*(n4-n3));
            double x = Math.random();
            double y =Math.random();
            double e = Math.random();
            if(e <= n2) {
                StdDraw.setPenColor(StdDraw.BLACK);
            }else{
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(x,y,z);
        }
    }
}
