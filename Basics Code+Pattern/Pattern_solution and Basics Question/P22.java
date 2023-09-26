public class P22 {
    
    public static void main(String[] args) {
        int n=5;
        int nst=n;//number of star in 1st row
        int nsp=-1;//number of space in 1st row
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
            if(i==1){
                 for(int cst=2;cst<=nst;cst++){
                System.out.print("*");  
            }
            }else{
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");  
            }
        }
            //nextline
            System.out.println();
            //preparation for the next row
        
                nsp+=2;
                nst--;
            
        }
    }
}
