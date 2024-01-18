public class canBalance {
    public static void main(String[] args){
            int[] a = {1, 1, 1, 2, 1};
                System.out.println(canBalance(a));
    }
    public static boolean canBalance(int[] a){
        int sum1=0,sum2=0;
        for(int i=0; i<a.length; i++){
            sum2=0;
            sum1 += a[i];
            for(int x=i+1; x<a.length; x++){
                sum2 += a[x];
            }
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }
}
