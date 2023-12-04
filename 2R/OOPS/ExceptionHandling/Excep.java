/**
 * Excep
 */
public class Excep {

    public static void main(String[] args) {
        
        int a=11;
        int b=0;
        int d=10;
       
        try{
               
             try {
                int[] arr={1,2,3};
                System.out.println(arr[4]);
             } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index not found");
                
             }
             int c=a/b;
        }catch(ArithmeticException e){

            System.out.println("cannot divided by zero");
             
        }finally{
            System.out.println("in the finally block ");

        }


        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // System.out.println(c);
        System.out.println("hello");
    }
}