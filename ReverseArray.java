
public class ReverseArray {
    public static void main(String[] args) {
        int i,x = 0;
        String temp ;

        String[] a ={"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for( i = 9; i >= 5; i--){
         temp = a[x];
         a[x] = a[i];
         a[i] = temp;
            x = x +1;
        }
        for(i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }
}

