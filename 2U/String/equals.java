import java.util.Scanner;

public class equals {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String s1=sc.nextLine();
       System.out.println(isequal(s1, str));

       






    }
    public static boolean isequal(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
