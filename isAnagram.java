import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String a, String b){
        if(a.length()==b.length()){
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1,arr2);
            if(result==true){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print(isAnagram("debit card","bad credit"));
    }
}
