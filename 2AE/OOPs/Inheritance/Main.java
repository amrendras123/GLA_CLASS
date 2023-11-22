public class Main {
    public static void main(String[] args) {
        
        // P p1=new P();
        // p1.fun();
        // C c1=new C();
        // // c1.fun();
        // System.out.println(c1.d);
        // System.out.println(c1.d1);


        // P p1=new C();
        // // System.out.println(p1.d);
        // // System.out.println(((C)(p1)).d1);
        // // ((C)(p1)).d;
        // p1.fun();
        int[] arr={1,2,3};
        System.out.println(arr[3]);


        P p1=new C();
        System.out.println(((C)(p1)).d);
        p1.fun();
        p1.fun();






    }
    
}
