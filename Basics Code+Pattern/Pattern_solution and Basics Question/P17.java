public class P17 {
    public static void main(String[] args) {
        int n=7;
        int nst=n/2;//number of star in 1st row
        int nsp=1;//number of space in 1st row
        int row=n;//number of rows in the pattern

        for(int i=1;i<=row;i++){
            //star
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");  
            }
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
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }
            
        }
    }
    
}
