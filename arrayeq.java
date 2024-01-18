public class arrayeq {
    public static boolean arreq(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

      return true;
    }
    public static void main(String[] args){
        int[] a = {6, 2, 9, 12, 3};
        int[] b = {6, 2, 9, 11, 3};

        System.out.println( arreq(a,b));
    }
}
