import java.util.Scanner;

public class SumOddEvenPlaces {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        boolean isOdd=true;
        while(n>0){
            int dig=n%10;
            if(isOdd){
                odd+=dig;
            }else{
                even+=dig;
            }
            isOdd=!isOdd;
            n/=10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
    
}
