public class ThreeSort {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int d = Math.max(a,b);
        int max = Math.max(d,c);

        int e = Math.min(a,b);
        int min = Math.min(e,c);

        int mid = (a+b+c) - max - min;

        System.out.println("Numbers in ascending order are: " + min +" "+ mid +" "+ max);
    }
}
