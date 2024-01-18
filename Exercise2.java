public class Exercise2 {
    public static void main(String[] args){
        System.out.println("Unique character is: "+uniqueChar("ABCDBADDAB"));

    }
    public static char uniqueChar(String s){
        int count=0;
        char a,b=' ';
        for(int i=0; i<s.length(); i++){
             a =s.charAt(i);
            for(int x=0; x<s.length(); x++){
                if(a == s.charAt(x)){
                    count++;
                }
            }
            if(count==1){
                b = s.charAt(i);
            }
            count=0;
        }
       return b;
    }
}
