import java.util.*;
public class Equal {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
       System.out.println(equals(s1, s2));
    }
    public static boolean equals(String str1,String s1){

        if(str1.length()!=s1.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){

            if(str1.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
