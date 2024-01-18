public class Ex2 {
    public static int findMax(int[] a)
    { return findMax(a, a.length); }
    // This helper function finds the maximum of first n elements in the array
    public static int findMax(int[] a, int n) {
        if(n==1) return a[0]; // base case
        int m = findMax(a,n-1); // recursively find the maximum of n-1 elements
        return Math.max(m, a[n-1]); // return maximum of m and the last element
    }
    public static void main(String[] args){
        int[] a = {1,2,3};
        System.out.println(findMax(a));
    }

}
