
/**
 * Inter
 */
interface car{

     void drive();
     void music();
}
/**
 * InnerInter
 */
 interface InnerInter {
    void fun();

    
}
class Inter implements car,InnerInter{

    public void fun(){
        
    }

    @Override
    public void drive() {
    
    }

    @Override
    public void music() {
        
    }

}