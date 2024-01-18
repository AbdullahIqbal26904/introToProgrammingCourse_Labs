public class span {
    public static int maxspan(int[] a) {
        int pos=0,max=0;
        for(int i = 0;i<a.length;i++){
            pos = 0;
            for(int x =i+1;x < a.length;x++){
                if(a[i] == a[x]){
                     pos = x-i;
                }
                if(pos>max){
                    max = pos;
                }
            }
        }
        return max+1;
    }
    public static void main(String[] args){
        int[] a ={1, 4, 2, 1, 4, 4 ,4,1,1,1,3,1,2,4,1,10,4,4,4,2,5,6};
        System.out.print(maxspan(a));
    }
}
