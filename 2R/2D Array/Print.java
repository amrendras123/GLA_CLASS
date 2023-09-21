import java.util.Scanner;

public class Print {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        
        // int[][] arr={
        //     {1,2,3,4,5},
        //     {5,6,7,8,9},
        //     {10,20,30,40,50},
        //     {12,1,31,4,15,2,3,4,5,6,7}

        // };
        print(arr);
    }
    public static void print(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
