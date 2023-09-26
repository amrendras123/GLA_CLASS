public class Armstrong {
    
    public static void main(String[] args) {
        

        int a=14346744;//intialize
        int sum=0;
        int b=a;
        int nod=0;
        while(b>0){
            nod++;
            b=b/10;
        }
        System.out.println(nod);
        b=a;
        while(b>0){
            int dig=b%10;
            sum+=dig*dig*dig;//sum=sum+Math.pow(dig,nod);
            b/=10;
        }
        System.out.println(sum);
        if(sum==a){
            System.out.println("Armtrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
