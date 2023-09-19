import java.util.Scanner;

/**
 * Reverse
 */
public class Reverse {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.println("before reverse");
        // print(arr);
        // reverse(arr);
        // System.out.println("after revrse");
        // print(arr);

    //     int a=10;
    //      int b=20;

    //     System.out.println("a is "+a);
    //     System.out.println("b is "+b);
    //     swap(a,b);
    //    System.out.println("a is "+a);
    //     System.out.println("b is "+b);

    int[] arr1={1,2,3,4,5};
    int[] arr2={6,7,8,9,10};
    print(arr1);
    print(arr2);

    swap1(arr1,arr2);
    print(arr1);
    print(arr2);
    }
    public static void swap1(int[] arr1,int[] arr2){
        int[] temp=arr1;
        arr1=arr2;
        arr2=temp;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }






    public static void print(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}