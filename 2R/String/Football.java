import java.util.Scanner;

public class Football {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        check(str);
        
    }
    public static void check(String str){

        if(str.contains("1111111")||str.contains("0000000")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
