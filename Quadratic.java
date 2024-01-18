public class Quadratic {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double x = b*b;
        double y = x- (4*a*c);

        if (y<0.0){
            System.out.println("The equation has no real roots");
        }else {
            double sq = Math.pow(y, 0.5);
            double ans1 = ((-1 * b) + sq) / (2 * a);
            double ans2 = ((-1 * b) - sq) / (2 * a);
            if(ans1 == ans2){
                System.out.println("The equation has one root :  " + ans1);
            }else
            System.out.println("The equation has two roots :  " + ans1 + "," + ans2);
        }
    }
}
