//LeetCode problem 1295
//Given an array nums of integers, return how many of them contain an even number of digits.
// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2


package Arrays;

import java.util.Scanner;

public class LC1295 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = in.nextInt();
        int[] nums= new int[n];
        
        System.out.println("Input");
        for(int i=0; i<n; i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Output: "+findNumbers(nums));
        in.close();
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noOfDigits = (int)(Math.log10(num))+1;
        return noOfDigits%2==0;
    }
}

