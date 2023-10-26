public class Student1 {

    String name;
    int roll_no;
    String address;

    // public Student1(){
    //     this.name="abc";
    //     this.roll_no=-1;

    // }
    public Student1(String name,int roll_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;

    }
    public Student1(String name,int roll_no){
          this.name=name;
          this.roll_no=roll_no;
    }

    public void introduce(){
        System.out.println("name is "+ name+"roll number is "+roll_no+" address is "+address);
    }
    public void printname(String name){
        System.out.println("name is "+name +"class name is "+this.name);
    }
    
}
