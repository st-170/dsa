/*" *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *  "*/

package Patterns;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<2*n ;i++){
            int totalCol= i>n?2*n-i:i;
            for(int col=0;col<totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
    }

    }
    
}
