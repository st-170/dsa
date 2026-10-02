package Arrays;

import java.util.Scanner;

public class minInArr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = in.nextInt();
        int[] nums= new int[n];
        
        System.out.println("fill the array");
        for(int i=0; i<n; i++){
            nums[i]=in.nextInt();
        }

        System.out.println("Smallest number is: "+min(nums));
        in.close();
    }
    
    static int min(int[] arr){
        int ans=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]< ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
