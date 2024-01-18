public class isPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String s){
      int a = s.length();
      if(a ==0 || a== 1){
          return true  ;
      }
        if (s.charAt(0) != s.charAt(a-1)) {
            return false;
        }
        return isPalindrome(s.substring(1,a-1));
    }
}
