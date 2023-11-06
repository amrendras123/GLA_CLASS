// import javax.management.loading.PrivateClassLoader;

/**
 * Student
 */
public class Student {

  String name;
  int rol_no;
  int id;
  String address;
  static int count;

  public Student(){
    this.name=null;
    this.rol_no=0;
    this.id=0;
    this.address=null;

  }
  public Student(String name,int rol_no){
    this.name=name;
    this.rol_no=rol_no;

  }
  public Student(String name,int rol_no,String address){
    this.name=name;
    this.rol_no=rol_no;
    this.address=address;
  }

  public void introduce(){
    fun();
    System.out.println(count);
    System.out.println("name is "+name+"roll number is "+rol_no+" id is "+id+" address is "+address);
  }
  public static void fun(){
    // introduce();
    System.out.println(count);
    System.out.println("playing cricket");
  }
  static{
    System.out.println("Welcome to gla");
  }
 
}