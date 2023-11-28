/**
 * Car
 */
abstract class Car1 {

    public abstract void drive();
    public abstract void drive2();
   

    public void music(){
        System.out.println("playing music...");
    }

}
 abstract class  Maruti extends Car1{

    public void drive(){
        System.out.println("driving..");
    }


}
class WagnoR extends Maruti{
     public void drive2(){
        System.out.println("drive2");
     }
}


    class Car{
    public static void main(String[] args) {
        
        // Car c1=new Car();
        // c1.drive();
        // c1.music();
        WagnoR w1=new WagnoR();
        w1.drive();
    }
}