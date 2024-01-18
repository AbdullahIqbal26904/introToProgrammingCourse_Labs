import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static ArrayList<Integer> arr(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i=0,x=0;

        while (i<nums.length-1){
            for( x=0; x<nums[i];x++){
                a.add(nums[i+1]);
            }
            i+= 2;
        }
        return (a);
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        System.out.println(arr(a));
    }
}
