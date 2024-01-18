public class Sumoftwodice {
public static void main(String[] args){
    int x = (int)(Math.random());
    int y = x * 6 + 1;

    int p = (int)(Math.random());
    int q = p * 6 + 1;

    int n = y + q;
    System.out.println("Sum of two numbers is : " + n);
}
}
