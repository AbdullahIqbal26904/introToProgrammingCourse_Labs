import java.awt.Color;
import java.util.Scanner;

public class roatate {
    public static void main(String[] args)
    {
        StdOut.println("Enter angle:  ");
        double angle = StdIn.readDouble();
        double angDeg = Math.toRadians(angle);
        Picture pic = new Picture("https://introcs.cs.princeton.edu/java/stdlib/mandrill.jpg");
        int si,sj,ti,tj;
        double ci= (pic.width()-1)/2;
        double cj = (pic.height()-1)/2;
        Picture target = new Picture(pic.width(),pic.height());
        for(ti=0; ti< pic.width(); ti++){
            for(tj=0; tj< pic.height(); tj++){
                double a = ti - ci;
                double b = tj - cj;
                si = (int) ((a*Math.cos(angDeg)) - (b* Math.sin(angDeg)) + ci);
                sj = (int) (((ti-ci)*Math.sin(angDeg)+(b*Math.cos(angDeg)+cj)));
                if (si >= 0 && si < pic.width() && sj >= 0 && sj < pic.height()) {
                    target.set(si,sj,pic.get(ti,tj));
                }
            }
        }
        target.show();
    }
}
