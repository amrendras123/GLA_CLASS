public class P13 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;//number of star in 1st row
        int nsp=0;//number of space in 1st row
        int row=2*n-1;//number of rows in the pattern

        for(int i=1;i<=row;i++){
            //space
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            //star
            for(int cst=1;cst<=nst;cst++){
               
                System.out.print("*");
                
            }
            //nextline
            System.out.println();
            //preparation for the next row
            if(i<=row/2){
                nst++;
            }else{
                nst--;
            }
            
        }
    }
    
}
