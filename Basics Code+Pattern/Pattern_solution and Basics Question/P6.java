public class P6 {
    public static void main(String[] args) {
        int n=5;
        int nst=n;//number of star in 1st row
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
            nsp+=2;
            nst--;
        }
    }
    
}
