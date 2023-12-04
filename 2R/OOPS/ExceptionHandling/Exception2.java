public class Exception2 {
    
    public static void main(String[] args) throws Exception{


        try{
        div(10, 0);
        }catch(ArithmeticException e){
            throw new Exception("cannot divided by zero");
        }
        

    }
    public  static void div(int a,int b){
        System.out.println(a/b);
    }
}
