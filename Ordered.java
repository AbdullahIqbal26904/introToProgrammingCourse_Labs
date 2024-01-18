public class Ordered {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        boolean b ;
        if((x>=y && y>=z) ||(x<=y && y<=z)) {
            b = true;
        }else b = false;
            System.out.println((boolean) b);

    }
}
