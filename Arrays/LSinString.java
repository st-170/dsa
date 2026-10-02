package Arrays;
import java.util.Scanner;

public class LSinString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=in.nextLine();
        System.out.print("enter the target: ");
        char tar=in.next().charAt(0);

        System.out.println(search(s, tar));
        in.close();
    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }

        for (char ch:str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}