
/**
 * Inter
 */
// class A{

// }
// class B{

// }
// class C extends A,B{

// }

 interface Car{
     void drive();
    void drive2();
     void music();

 }
 interface car2{
    void music2();

 }
 interface B extends Car,car2{

 }
 class A implements Car,car2{
    public void drive(){

    }
    public void drive2(){

    }
    public void music(){

    }
    public void music2(){

    }

 }




public class Inter {

    public static void main(String[] args) {
        
    }
}