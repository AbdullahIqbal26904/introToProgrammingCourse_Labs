public class Hellos {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        for(int x =1; x<= i; x++) {
            if (x%100 >= 11 && x%100 <= 20) {
                System.out.println(x+"th "+"Hello");
            }
            else if(x%10 == 1) System.out.println(x+"st "+"Hello");
            else if(x%10 == 2) System.out.println(x+"nd "+"Hello");
            else if(x%10 == 3) System.out.println(x+"rd "+"Hello");
            else  System.out.println(x+"th "+"Hello");

        }
        }
    }

