/**
 * Abs1
 */
public abstract class Car {

    public abstract void drive();
    public abstract void drive2();

    public void music(){
        System.out.println("Playing music");
        
    }
}
abstract class WagnoR extends Car{

    public void drive(){
        System.out.println("drive");
        
    }
}
class Maruti extends WagnoR{

    public void drive2(){
        System.out.println("drive2");

    }

}

