/**
 * P1
 */
abstract  class Parent {

    String name;
    int roll_no;

    public abstract void drive();
    public void fun(){
        System.out.println("have fun");
    }
    
}
class C extends Parent{

    public void drive(){
        System.out.println("driving");
    }

}