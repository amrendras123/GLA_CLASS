import java.util.Scanner;

public class Equals {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // String s1=sc.nextLine();
        // String s2=sc.nextLine();

        // System.out.println(equal(s1, s2));
        char ch='a';
        char ch1='A';
        System.out.println((int)ch);
        System.out.println((int)(ch1));

        String str1="hello";
        for(int i=0;i<str1.length();i++){
            System.out.println((int)str1.charAt(i));
        }

        
    }
    public static boolean equal(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return  false;
            }
        }

        return true;
    }
}
