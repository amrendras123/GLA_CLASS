import java.util.Scanner;

public class Insertionsort {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before soting");
        print(arr);
        i_sort(arr);
        System.out.println("after sorting");
        print(arr);
    }
    public static void i_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }

    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
