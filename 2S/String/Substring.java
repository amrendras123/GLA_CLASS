import java.util.Scanner;

public class Substring {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        substring(str);
        
    }
    public static void substring(String str){
        int count=0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                  String ans=str.substring(i, j);
                  boolean isPa=isPlaindrome(ans);
                  if(isPa==true){
                    count++;
                    System.out.println(ans);

                  }
                 
            }
             System.out.println(count);
        }
    }
    public static boolean isPlaindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
