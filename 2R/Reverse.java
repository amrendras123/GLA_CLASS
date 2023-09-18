import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the value of Array :");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = 0; k <= arr.length - 1; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Print after reverse function call :");
         for (int k = 0; k <= arr.length - 1; k++) {
            System.out.print(arr[k] + " ");
        }

       
    }
    public static void reverse(int[] arr){
         int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("After reversing Array :");
         for (int k = 0; k <= arr.length - 1; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

}
