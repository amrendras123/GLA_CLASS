public class P20 {

    public static void main(String[] args) {
        int n=7;
        int nsp1=n/2;
        int nsp2=-1;
        int row=n;
        for(int i=1;i<=row;i++){

            for(int csp=1;csp<=nsp1;csp++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int csp=1;csp<=nsp2;csp++){
                System.out.print(" ");
            }
            if(!(i==1||i==n)){
            System.out.print("*");
            }

            System.out.println();
            if(i<=row/2){
                nsp1--;
                nsp2+=2;
            }else{
                nsp1++;
                nsp2-=2;
            }


        }
    }
    
}
