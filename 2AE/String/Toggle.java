import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        toggle(s);
        
    }
    public static void toggle(String s1){
        String s2="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isUpperCase(ch)){
                s2=s2+Character.toLowerCase(ch);

            }else{
                s2=s2+Character.toUpperCase(ch);
            }

        }
        System.out.println(s2);
    }
    
}
