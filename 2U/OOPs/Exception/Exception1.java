/**
 * Exception1
 */
public class Exception1 {

    public static void main(String[] args) {
        
        int a=5;
        int b=0;
        int[] arr={1,2,3};
        int c;
        int d;
        try{
         c=a/b;
         
         d=arr[2];
    
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("cannot divided by zero");
            System.out.println("helo");
        }finally{
            System.out.println("hello from finally");
        }

        
    }
}