
abstract class Car{
    String name;
    String color;
    public abstract void drive();
    public abstract void fun();

    public void music(){
        System.out.println("play music");
    }
}
abstract class WagnoR extends Car{
    public void drive(){
        System.out.println("driving...");
    }


}
class maruti extends WagnoR{
    public void fun(){
        System.out.println("have fun");
    }

}

class Veh{

    public static void main(String[] args) {
        // Car c1=new Car();
        Car w1=new maruti();
        w1.music();
        w1.drive();
        w1.fun();
        
    }
}