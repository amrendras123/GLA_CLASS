// package Encapsulation;

public class Car {
   private String name;
   private int price;
    String color;
    String model;

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String name,int price){
        this.name=name;
        this.price=price;

    }
    // public void setName(String name){
    //     this.name=name;

    // }
    // public String getName(){
    //     return this.name;
    // }
    //     public void setPrice(int price){
    //         if(price<0){
    //             System.out.println("price cannot be naegative");
    //             return ;
    //         }
    //     this.price=price;

    // }
    // public int getPrice(){
    //     return this.price;
    // }
    public void des(){
        System.out.println("name is "+name+" price is "+price);
    }
    
}
