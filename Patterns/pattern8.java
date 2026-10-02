/* " * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *  " */

package Patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=2*n;i++){
            if(i==n){
                continue;
            }
            int tCol=i>n?i-n:n-i;
            int tspace=i>n?2*n-i+1:i+1;
            for(int space=0;space<tspace;space++){
                System.out.print(" ");
            }
            for(int j=0;j<tCol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
