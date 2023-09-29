// package 2D-Array;
import java.util.*;
public class WavePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("print the Array");
        Waveprint(arr);

        // print(arr);

    }
    public static void Waveprint(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int row=0;row<arr.length;row++){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for(int row=arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
            }
        }



    }
        
    public static void print(int[][] arr){
        for(int row=0;row<arr.length;row++){
    for(int col=0;col<arr[0].length;col++){
        System.out.print(arr[row][col]+" ");
    }
    System.out.println();
}
    
}
}