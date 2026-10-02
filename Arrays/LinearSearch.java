package Arrays;

import java.util.Scanner;

public class LinearSearch {
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = in.nextInt();
        int[] nums= new int[n];
        
        System.out.println("fill the array");
        for(int i=0; i<n; i++){
            nums[i]=in.nextInt();
        }
        System.out.println("enter the Target");
        int target=in.nextInt();
        
        System.out.println("element is at the index "+search2(nums,target));
        in.close();
    }
    //code for linear search
    static int search(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int index=0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
    
    //search in range
    static int search2(int[] arr, int target){

        Scanner in=new Scanner(System.in);

        System.out.println("enter starting point and ending point");
        int start=in.nextInt();
        int end=in.nextInt();
        in.close();
        if (arr.length==0){
            return -1;
        }

        for (int index=start; index<=end;index++){
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
}
