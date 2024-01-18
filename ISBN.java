public class ISBN {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        int d2 = a % 10;
        int d3 = (a % 100)/10;
        int d4 = (a % 1000)/100;
        int d5 = (a % 10000)/1000;
        int d6 = (a % 100000)/10000;
        int d7 = (a % 1000000)/100000;
        int d8 = (a % 10000000)/1000000;
        int d9 = (a % 100000000)/10000000;
        int d10 = (a % 1000000000)/100000000;

        int x;
        x = (d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9+d10*10);
        int d1 = 11-(x % 11);
        System.out.println(""+d10+d9+d8+d7+d6+d5+d4+d3+d2+d1);
    }
    }
