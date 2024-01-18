public class evenDigits {
    public static void main(String[] args){
        System.out.print(evenDigits(42109));
    }
    public static int evenDigits(int n){
        int x = n%10;
        if(n==0) return 0;
        if(x%2==0) return 10*evenDigits(n/10) + x;
        return evenDigits(n/10);
    }
}