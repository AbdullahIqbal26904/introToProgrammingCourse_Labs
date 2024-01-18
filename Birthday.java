public class Birthday {
    public static void main(String[] args) {
        int a ;
        boolean[] BD;
        BD = new boolean[364];
        int count  =0;
        while(true){
            a = (int)(Math.random()*365);
            if(!BD[a])
                BD[a]=true;
            else {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
    }
