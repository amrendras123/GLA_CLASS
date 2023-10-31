/**
 * Student
 */
public class Student {

    String name;
    int roll_no;
    String address;


   
    public Student(String name1,int roll_no1){
        name=name1;
    roll_no=roll_no1;
    }
     
    public void introduce(){
        System.out.println("name is "+name+" roll number is "+roll_no+" address is "+address);
      
    }
    public void fun(){
        System.out.println("playing cricket");
    }

}