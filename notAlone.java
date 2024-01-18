public class notAlone {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int[] b =notAlone(a);
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
    public static int[] notAlone(int[] a){
        for(int i=1; i<a.length-1; i++){
            if(a[i-1] != a[i] && a[i+1]!=a[i]){
                if(a[i-1]>a[i+1]){
                    a[i] = a[i-1];
                }else if(a[i+1] > a[i-1]){
                    a[i] = a[i+1];
                }
            }
        }
        return a;
    }
}
