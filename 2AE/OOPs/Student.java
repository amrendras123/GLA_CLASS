/**
 * Student
 */
public class Student {

    String name;
    int roll_no;
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
    public Student(String name,int roll_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }






    public void introduce(){
        System.out.println("name is "+name+" roll number is "+roll_no+ "address is "+address);
    }
    

}