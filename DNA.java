import java.util.Arrays;

public class DNA {
    public static void main(String[] args){
        System.out.print(Arrays.toString(dna("ATAGATGCATAGCGCATAGCTAGATGTGCTGAC")));
    }
    public static String[] dna(String s){
        String a="";
        int c=0;
        String[] v = new String[2];
        for(int i=0; i<s.length()-3; i++){
            if(s.substring(i,i+3).equals("ATG")){
                for(int x=i+3; x<s.length()-3; x+=3){
                    if(s.substring(x,x+3).equals("TAG")||s.substring(x,x+3).equals("TAA")||s.substring(x,x+3).equals("TGA")){
                        a=s.substring(i,x+3);
                        v[c++] = a;
                    }
                }
            }
        }
        return v;
    }
}
