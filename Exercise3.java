import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Exercise3 {
    public static boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == (inner.length)) return true;
        return false;
    }
    public static void main(String[] args){
        int [] a={1, 2, 4, 6};
        int [] b={2, 4};
        System.out.println(linearIn(a, b));
    }
}
