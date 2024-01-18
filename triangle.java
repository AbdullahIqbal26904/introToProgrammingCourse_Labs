public class triangle {
    public static void eqtraingle(double x,double y, double s){
        double a = y + Math.sqrt(3)/2 * s;
        double b = x - s/2;
        double b1 =  y - Math.sqrt(3)/6 * s;
        double c = x + s/2;
        double c1 =  y - Math.sqrt(3)/6 * s;
        StdDraw.line(x,a,b,b1);
        StdDraw.line(c,c1,b,b1);
        StdDraw.line(x,a,c,c1);

    }
    public static void main(String[] args){
        eqtraingle(0.5,0.5,0.5);
    }
}
