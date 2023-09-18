/**
 * swap
 */
public class swap {

    public static void main(String[] args) {
        
        int a=10;
        int b=20;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        Swap(a,b);
        //  System.out.println("a is "+a);
        //  System.out.println("b is "+b);

    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        // System.out.println("a is "+a);
        //  System.out.println("b is "+b);
        
    }
}