public class Harmonic {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double x = 1;
        double N = 0;
        while(x <= n ){

             N = 1/x + N ;
             x = x + 1;
        }
        System.out.println((double) N);
    }

}
