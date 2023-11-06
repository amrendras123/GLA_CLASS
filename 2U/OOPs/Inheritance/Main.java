public class Main {
    public static void main(String[] args) {
        
        C c1=new C("abc");
        System.out.println(c1.d1);
        c1.fun();
        c1.name="abc";
        System.out.println(c1.name);
    }
}
