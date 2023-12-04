public class throw1 {
    
    public static void main(String[] args) {
     
        try{
        div(10,0);
        }catch(Exception e){
             System.out.println("cannnot divided by zero");
        }
        
    }
    public static void  div(int a,int b) throws ArithmeticException{
           System.out.println(a/b);
        // return a/b;
    }
}
