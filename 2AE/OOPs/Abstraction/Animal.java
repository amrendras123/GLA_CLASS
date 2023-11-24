/**
 * InnerAnimal
 */

 interface Animal {

    public abstract void fun();
    public abstract void run();

    
}

 interface InnerAnimal {

    
}
class A implements Animal,InnerAnimal{

   
    public void fun() {
       
    }

    public void run() {
      
    }

}
