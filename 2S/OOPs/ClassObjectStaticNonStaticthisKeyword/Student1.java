public class Student1 {

    private String name;
    int roll_no;
    String address;
    static int count;


    public Student1(){
        this.name=null;
        this.roll_no=0;
        this.address=null;

    }
    public Student1(String name,int roll_no){
         this.name=name;
         this.roll_no=roll_no;
    }
    public Student1(String name,int roll_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }
    public static void fun(){
        System.out.println("have fun");
    }


    public void introduce(){
        fun();
        System.out.println("name is "+ name+"roll number is "+roll_no+" address is "+address);
    }
    public void printname(String name){
        System.out.println("name is "+name +"class name is "+this.name);
    }
    static {
        System.out.println("hi from here");
    }
    
}
