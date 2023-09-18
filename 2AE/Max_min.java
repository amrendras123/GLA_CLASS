import java.util.Scanner;

public class Max_min {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter the value of Array");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("max of the array is "+max(arr));
        System.out.println("min of the array is "+min(arr));
    }
     public static int min(int[] array){
        int min=array[0];
        for(int i=0;i<=array.length-1;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;

    }
    public static int max(int[] array){
        int max=array[0];
        for(int i=0;i<=array.length-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;

    }
}
