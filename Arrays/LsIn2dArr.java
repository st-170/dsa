package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LsIn2dArr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of rows and coloums");
        int row= in.nextInt();
        int col=in.nextInt();
        int[][] nums= new int[row][col];
        
        System.out.println("fill the array");
        for(int i=0; i<row; i++){
            for(int j=0 ;j<col; j++)
            nums[i][j]=in.nextInt();
        }
        System.out.println("enter the Target");
        int target=in.nextInt();

        int[] ans=search(nums, target);
        System.out.println(Arrays.toString(ans));
        in.close();
    }

    static int[] search(int[][] arr, int target){
        for (int row=0; row<arr.length; row++){
            for (int col=0;col < arr[row].length; col++){
                if (arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
