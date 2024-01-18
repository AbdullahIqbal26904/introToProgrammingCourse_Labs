public class Distance {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = (0-a)*(0-a);
        int d=  (0-b)*(0-b);
        double e = Math.sqrt(c+d);
        System.out.println("Distance"+"= "+e);
    }
}
