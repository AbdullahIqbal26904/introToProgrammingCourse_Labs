public class removeX {
    public static void main(String[] args){
        System.out.print(removeX("xaxgrtrx"));
    }
    public static String removeX(String s){
      if(s.length()==0) return "";
      if(s.charAt(0) == 'x') return removeX(s.substring(1));
      else{
          return s.charAt(0) + removeX(s.substring(1));
      }
    }
}
