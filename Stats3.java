public class Stats3 {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        double avg = (a + b + c) / 3;
        double max = Math.max(a, b);
        double max2 = Math.max(max, c);
        double min = Math.min(a, b);
        double min2 = Math.min(min, c);

        System.out.println("Average of numbers are :" + avg);
        System.out.println("Maximum number of numbers are :" + max2);
        System.out.println("Minimum number of numbers are :" +  min2);
    }

    }
