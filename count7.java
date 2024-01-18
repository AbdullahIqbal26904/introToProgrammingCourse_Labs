public class count7 {
    public static int count7(int n) {
        int c = 0;
        if(n < 7){
            return 0;
        }else{
            if(n%10 == 7){
             c=1;
            }else {
                c=0;
            }
        }
        return c+count7(n/10);
    }
    public static void main(String[] args){
        System.out.print(count7(717));
    }

}
