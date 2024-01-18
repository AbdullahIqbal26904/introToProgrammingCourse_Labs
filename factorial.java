public class factorial {
    public static void main(String[] args){
        long n = factorial(10);
        System.out.println(n);
    }
    public static long factorial(int n){
        int c = 1;
        for(int i = 1; i<=n ; i++){
            c=c*i;
        }
        return c;
    }
}
