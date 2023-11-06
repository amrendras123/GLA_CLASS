// package LAB1;

public class Car {
    
   private String name;
   private int price;
   final String model;
   
    String color;

    public static void fun(){
        System.out.println("have fun");
    }

    public void getName(){
        System.out.println(this.name);
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){

        return this.price;
    }
    public void setPrice(int price){
        if(price<0){
        System.out.println("price cannot be naegative");
        return ;
        }
        this.price=price;
    }

    public Car(String name,int price){
         this.name=name;
         this.price=price;
    }




    public void description(){
        System.out.println("name is "+name +" price is "+price+" model is "+model+" color is "+color);
    }
    //getter setter method 
    //acess modifier

}
