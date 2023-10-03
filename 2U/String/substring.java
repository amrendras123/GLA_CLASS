import java.util.Scanner;

public class substring {
    
    public static void main(String[] args) {
        // String str="abcde";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        subs(str);
    }

    public static void subs(String str){
        int count=0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String str1=str.substring(i, j);
                boolean ans=isPalindrome(str1);
                if(ans==true){
                    count++;
                    System.out.println(str1);
                }
                // System.out.println(str1);
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}