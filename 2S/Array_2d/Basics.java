// package Array_2d;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        
        // int[] arr={1,2,3,4,5};
    //     int[][] arr={
    //         {1,2,3,4,5},
    //         {3,4,5,1,2},
    //         {0,9,8,7,6}
        
    // };
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] arr=new int[row][col];

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    print(arr);

    
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
