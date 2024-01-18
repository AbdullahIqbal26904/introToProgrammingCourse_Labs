public class HappyFamily {
    public static void main(String[] args) {
        int count= 0;
        int count2= 0;
        int d = 0;
        while(count == 0 || count2 == 0 ){
            double a =  Math.random();
            if( a <= 0.5){
                count++;
            } else  {
                count2++ ;
            }
            d  = count + count2;
        }
        System.out.println("Family has " + d + " number of childrens");

    }

}
