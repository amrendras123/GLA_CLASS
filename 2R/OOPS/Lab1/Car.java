

public class Car {

    String name;
   private int price;
    String color;
    String model;
    final int count=75;
     
//     public String getName(){
//         return this.name;
//     }
//   public void setName(String name){
//     this.name=name;
//   }
//   public int getPrice(){
//     return this.price;
//   }
//   public void setPrice(int price){
//     if(price<0){
//         System.out.println("price cannot be negative");
//         return ;
//     }
//     this.price=price;
//   }

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
    public void des(){
        System.out.println("name is "+this.name+" price is "+this.price+" color is "+this.color);
    }
    
}
