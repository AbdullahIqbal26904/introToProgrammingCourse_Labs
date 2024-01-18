public class FivePerLine {
    public static void main(String[] args) {
        int s = 1001;
        int e =2000;
        int pl = 5;
        String a;
        a ="";
        for(int x = 1;x <= 200;x++) {
            for (int y = 1; y <= 5; y++) {
                a = a + " " + s;
                s = s + 1;
            }
            System.out.println(a);
            a = "";
        }
    }
}
