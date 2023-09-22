import java.util.Scanner;

public class Selectionsort {
    
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sort");
        print(arr);

        S_sort(arr);
        System.out.println("after sort");
        print(arr);
    }

    public static void S_sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int s_idx=i;
         for(int j=i+1;j<arr.length;j++){
               if(arr[s_idx]>arr[j]){
                s_idx=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[s_idx];
            arr[s_idx]=temp;
        }

    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
