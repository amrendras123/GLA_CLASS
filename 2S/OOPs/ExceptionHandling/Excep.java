/**
 * Excep
 */
public class Excep {

    public static void main(String[] args) {
        
            int a=10;
            int b=0;
           
            // System.out.println(c);
            int[] arr={1,2,3};
            int d;

            //prime
            try{
                 int c=a/b;
                //  d=arr[4];

            }catch(ArithmeticException e){

                System.out.println("cannot divided by zero");

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("index not found");
            }
            finally{
                System.out.println("hello from here");
            }
    }
}