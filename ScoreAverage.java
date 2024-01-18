public class ScoreAverage {
    public static void main(String[] args){
        int[] a = {3, 4, 100, 1, 2, 3};
        System.out.println(scoresAverage(a));
    }
    public static int average(int[] scores, int start, int end){
        int sum1=0,sum2=0;
        for(int i=start; i<=end; i++){
            sum1 += scores[i];
        }
       int x=(end-start+1);
        int avg = sum1/x;
        return avg;
    }
    public static double scoresAverage(int[] a){
        int b = a.length;
        //int x = b/2;
        double avg1 =average(a,0,b/2-1);
        double avg2 = average(a,b/2,b-1);
        if(avg1 > avg2){
            return avg1;
        }
        return avg2;
    }
}
