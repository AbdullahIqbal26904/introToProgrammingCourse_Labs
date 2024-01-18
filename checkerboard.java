import java.util.Scanner;

public class checkerboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        double len = sc.nextInt();
        StdDraw.setYscale(0,len);
        StdDraw.setXscale(0,len);
        for(int i = 0; i < len; i++){
            for(int y = 0;y < len;y++){
                if((i+y) % 2 == 0 ){
                    StdDraw.setPenColor(StdDraw.RED);
                }else{
                    StdDraw.setPenColor(StdDraw.BLACK);
                }
                StdDraw.filledSquare(i+0.5,y+0.5,0.5);
            }
        }
    }
}
