public class Lottery {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = a/100;
        int c = (a%100)/10;
        int d = a%10;
        int e = (int)(Math.random() * 1000);
        int f = (int)(e/100);
        int g = (int)((e%100)/10);
        int h = (int)(e%10);
        if (a == h){
            System.out.println("Your award is 1 million" );
        }
        if((b==f || b == g || b== h) && (c == f || c == g || c ==h) && (d == f || d == g || d == h) ){
            System.out.println("Your award is 5 lac rupees.");
        }
        if((b==f || b == g || b== h) || (c == f || c == g || c ==h) || (d == f || d == g || d == h)){
            System.out.println("Your award is 1 lac rupees.");
        }
        else System.out.println("No Award");


    }
}
