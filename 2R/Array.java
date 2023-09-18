import java.util.Scanner;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the value of Araay");

        for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
        }

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.println("sum of Array element is "+sum);

        // int[] arr={1,2,3,4,56,78,10};

        // // System.out.println(arr[0]);
        // // System.out.println(arr[1]);

        // for(int i=0;i<=arr.length-1;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("__________________________________________________________________");
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

    }
}