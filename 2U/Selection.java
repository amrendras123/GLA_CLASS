import java.util.Scanner;

public class Selection {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        print(arr);
        S_sort(arr);
        System.out.println("after sorting");
        print(arr);
        
    }
    public static void S_sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
