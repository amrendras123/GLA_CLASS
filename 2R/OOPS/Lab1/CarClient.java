
public class CarClient {

    public static void main(String[] args) {

        Car c1=new Car("abc", 100000);



        // int[] arr={1,2,3,4};
        // System.out.println(arr[5]);
        // int a=10;

        c1.des();
        // c1.price=100;
        // c1.price=-100;
        // c1.des();
        System.out.println(c1.getPrice());

        c1.setPrice(110000);
        c1.des();
        c1.setPrice(-1000000);
        c1.des();
    }

    
    
}
