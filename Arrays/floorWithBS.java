package Arrays;

import java.util.Scanner;

public class floorWithBS {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = in.nextInt();
        int[] nums= new int[n];
        
        System.out.println("fill the array");
        for(int i=0; i<n; i++){
            nums[i]=in.nextInt();
        }

        System.out.print("target: ");
        int target=in.nextInt();

        System.out.println(floor(nums, target));
        in.close();
    }

    static int floor(int[] arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
