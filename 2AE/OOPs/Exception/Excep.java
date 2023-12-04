/**
 * Excep
 */
public class Excep {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr={1,2,34};
        int d;
        try{
        
        try{
           System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException ar){

            System.out.println("index not found");

        }
        int c=a/b;
        
        }catch(ArithmeticException e){
              System.out.println("cannot divided by zero");
        }catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }finally{
            System.out.println("hello from here");
        }
        // System.out.println(c);
        System.out.println("hello");
    }
}