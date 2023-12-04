/**
 * Student
 */
public class Student {

   private static  String name;
  private int roll_no;
    String address;
    static int count;
     public Student(){
        name=null;
        roll_no=0;
        address=null;
     }
      public Student(String name1,int roll_no1){
        name=name1;
    roll_no=roll_no1;
    }


static{
    System.out.println("welcome to gla");

}


     public void fun1(){
        fun();
        System.out.println("in fun1");
     }

     public static void fun(){
        
        System.out.println(name+" have fun");
     }
   
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRoll_no() {
        return roll_no;
    }


    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public static int getCount() {
        return count;
    }


    public static void setCount(int count) {
        Student.count = count;
    }


   
    public Student(String name,int roll_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }






    public void introduce(){
        System.out.println("name is "+name+" roll number is "+roll_no+ "address is "+address);
    }
    

}