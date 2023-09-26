public class P18 {

    public static void main(String[] args) {
        int n=7;
        int nst=1;//number of star in 1st row
        int nsp=n-1;//number of space in 1st row
        int row=n;//number of rows in the pattern

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
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            
        }
    }
    
}
