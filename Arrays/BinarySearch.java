package Arrays;

import java.util.Scanner;

public class BinarySearch {
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

        System.out.println(search2(nums, target));
        in.close();
    }

    //when order is known
    static int search(int[] arr, int target){

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
        return -1;
    }

    //when order is unknown 
    static int search2(int[] arr, int target){

        int start=0;
        int end = arr.length-1;

        boolean isAsc=arr[start] < arr[end];

        while(start<=end){

            int mid = start+(end - start)/2;

            if (target==arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target>arr[mid]){
                    end=mid-1;
                    }
                else{
                    start=mid+1;
                }
            }
        }
    return -1;
    }
}
