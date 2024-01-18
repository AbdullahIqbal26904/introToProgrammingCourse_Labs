import java.util.Scanner;
public class Ramanujan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a3=0,y = 0,b3 = 0, x = 0,c3 = 0,d3 = 0,t=0;
        for(int i = 1; (i*i*i) <= n;i++){
             a3 = i*i*i;
            for(x = 1;(x*x*x)<= n;x++){
                 b3 = x*x*x;
                if((a3+b3)==n){
                    break;
                }
            }for( y = i+1; (y*y*y) <= n;y++){
                 c3 = y*y*y;
                for(t = 1;(t*t*t)<= n;t++){
                    d3 = t*t*t;
                    if((c3+d3)==n){
                        break;
                    }
                }
                if((c3+d3)==n){
                    break;
                }
            }
            if((a3+b3) == n && (c3 + d3) == n){
                System.out.println("It is the number that can be express as the sum of cubes in two different ways so its not a dull number and two different ways are:- ");
                System.out.println(i +"*"+i+"*"+i+" + "+x+"*"+x+"*"+x + " and " + y +"*"+y+"*"+y+" + "+t+"*"+t+"*"+t + " = "+n);

                break;
            }
        }
        if((a3+b3) != n || (c3 + d3) != n){
            System.out.println("Its a dull number");
        }
    }
}



