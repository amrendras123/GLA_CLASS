public class Main {
    public static void main(String[] args) {

        // P p1=new P();//case 1
        
        // C c1=new C();//case 4
        // System.out.println(c1.d1);
        // c1.fun();
        // c1.name="abc";
        // System.out.println(c1.name);

        P p1=new C();
        // System.out.println(((C)(p1)).d);//parent d
        // // System.out.println(p1.d);
        // // System.out.println(p1.d2);
        p1.fun();
        p1.fun1();
    //     int[] arr={1,2,3,4};
    //   System.out.println(arr[4]);
    
    }
}
