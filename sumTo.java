public class sumTo {
    public static double sumTo(int n){
        if(n==1) return 1;
        return 1.0/n + sumTo(n-1);
    }
    public static void main(String[] args){
        System.out.println(sumTo(2));
    }
}
