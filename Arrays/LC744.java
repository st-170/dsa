//LeetCode problem 
//744. Find Smallest Letter Greater Than Target
/*Input: letters = ["c","f","j"], target = "a"
 Output: "c"
 Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
*/

package Arrays;

import java.util.Scanner;

public class LC744 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char[] letters= {'c','f','j'};
        System.out.print("enter the target: ");
        char target=in.next().charAt(0);

        System.out.println(nextGreatestLetter(letters, target));
        in.close();
    }

    static char nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid= start +(end-start)/2;

            if (target < letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
    // static char nextGreatestLetter2(char[] letters, char target){
    //     char ans=' ';
    //     if(letters[0]>target || letters[letters.length-1]<target){
    //         return letters[0];
    //     }
    //     for (int i=0;i<=letters.length-1;i++){
    //          if(letters[i]<=target){
    //             ans=letters[i+1];
    //             break;
    //          }
    //     }
    //     return ans;
    // }

}
