/*LeetCode problem 26
Remove Duplicates from Sorted Array
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
package Arrays;

import java.util.Arrays;

public class LC26 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(returnDuplicate(nums));
    }

    static int returnDuplicate(int[] nums){
        if (nums.length==0){
            return 0; 
        }
        
        int k=1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    
}
