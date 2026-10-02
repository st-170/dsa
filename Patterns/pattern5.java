/*"      *
        **
       ***
      ****
     ***** " */


package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int space=0;space<5-i-1;space++){
                System.out.print(" ");
            }
            for (int col=0;col<=i;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
