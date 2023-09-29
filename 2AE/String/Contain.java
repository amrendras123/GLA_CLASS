import java.util.Scanner;

public class Contain {
    
    public static void main(String[] args) {
        // String str="abcdefraaa";

        // System.out.println(str.contains("abcd"));
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        check(s1);
    }
    public static void check(String str){

        if(str.contains("0000000")||str.contains("1111111")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
