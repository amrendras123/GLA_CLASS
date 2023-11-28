/**
 * Except
 */
public class Except {

    public static void main(String[] args) throws Exception {
        
        int a=10;
        int b=0;
        try{
        int c=a/b;
        }catch(Exception e){
            throw new Exception("cannot divide by zero");
        }
        finally{
            System.out.println("it willalways be excecuted");
        }
    }
}