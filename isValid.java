public class isValid {
    public static boolean isValid(String s){
        if(s.length()<10) return false;
        int count=0,x=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
            if(Character.isDigit(s.charAt(i))){
                x++;
            }
        }
        int v = count+x;
        if(v==s.length()){
            if(count>=1 && x>=2) return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print(isValid("a123456789213"));
    }
}
