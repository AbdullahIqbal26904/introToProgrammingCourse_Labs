public class RollLoadedDie {
    public static void main(String[] args) {
        int i = (int)(Math.random()*8) + 1;
        if(i <= 5){
            System.out.println(i);
        }else{
            System.out.println("6");
        }
    }
    }
