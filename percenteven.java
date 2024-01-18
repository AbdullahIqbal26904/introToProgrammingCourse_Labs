public class percenteven {
    public static double percenteven(int[] a){
        int n=0,n2=0;

        for(int i = 0;i<a.length; i++){
            n = n+ 1;
            if(a[i] % 2 == 0){
                n2 = n2 +1;
            }
        }
        double per = (double)n2/n *100;
        return per;
    }
    public static void main(String[] args){
        int[] a = {6, 2, 9, 11, 3};
        System.out.println(percenteven(a));
    }
}
