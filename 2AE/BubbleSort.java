import java.util.Scanner;

public class BubbleSort {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before soting");
        print(arr);
        B_sort(arr);
        System.out.println("after sorting");
        print(arr);
    }
    public static void B_sort(int[] arr){

        for(int turn=0;turn<arr.length-1;turn++){

            for(int j=0;j<arr.length-turn-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
