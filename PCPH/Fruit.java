import java.util.Scanner;

/**
 * p1
 */
public class Fruit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();

        boolean ans=check(weight);
        if(ans==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
 
    }
    public static boolean check(int weight){
        
        if(weight%2==0&&weight>2){
            return true;
        }
        return false;
    }
}