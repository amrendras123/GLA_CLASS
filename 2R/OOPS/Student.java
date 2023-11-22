/**
 * Student
 */
public class Student {

     String name;
    int roll_no;
    String address;
    static int count;

 public Student(){

 }
 public Student(String name,int roll_no){
    this.name=name;
    this.roll_no=roll_no;
 }
     
    public  void introduce(){
        System.out.println("name is "+name+" roll number is "+roll_no+" address is "+address);
      
    }
    public static void fun(){
        System.out.println("playing cricket");
    }
    static{
        System.out.println("welcome to gla");
    }

}