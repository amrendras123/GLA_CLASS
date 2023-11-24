/**
 * Car
 */
public abstract class Car {

    public abstract void drive();
    public abstract void drive2();


    public void music(){
        System.out.println("Play music");
    }

    
}
abstract class WagnoR extends Car{

    public void drive() {
   System.out.println("driving");
    }
}

class Maruti extends WagnoR{
public void drive2(){


}
}