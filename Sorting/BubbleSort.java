package Sorting;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={66,88,54,27,63,15};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr){
        for (int i=0; i<arr.length; i++){
            boolean swapped = false;
            for (int j=1; j<arr.length-i; j++){
                if(arr[j]< arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
