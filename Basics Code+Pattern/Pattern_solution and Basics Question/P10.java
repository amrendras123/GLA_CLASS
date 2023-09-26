public class P10 {
    public static void main(String[] args) {
        int n=5;
        int nst=2*n-1;//number of star in 1st row
        int nsp=0;//number of space in 1st row
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
            nsp++;
            nst-=2;
        }
    }
    
}
