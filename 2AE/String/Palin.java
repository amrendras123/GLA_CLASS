/**
 * Palin
 */
import java.util.*;
public class Palin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
       boolean ans= isPalindrome(s1);
       if(ans==true){
        System.out.println("YES");
       }else{
        System.out.println("NO");
       }

    }
    public static boolean isPalindrome(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}