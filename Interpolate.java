import java.util.Scanner;

public class Interpolate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt(),m=0;
        double[] a = new double[n];
        int x = n + (n-1);
        double[] b = new double[x];
        for(int c = 0; c < a.length; c++){
            System.out.print("Enter number: ");
            double n2 = sc.nextInt();
            a[c] = n2;
        }
        for(int i = 0; i < a.length;i++){
            b[m] = a[i];
            m = m + 2;
        }
        m = 1;
        for(int i = 0; i < (a.length-1);i++){
            b[m] = (a[i]+a[i+1])/2 ;
           m = m + 2;
            }
        for(int c = 0; c < b.length; c++){
            System.out.println(b[c]);
        }
        }

    }

