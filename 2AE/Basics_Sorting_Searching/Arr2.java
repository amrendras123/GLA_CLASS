import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the value of Array :");

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
         for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("odd is "+arr[i]);
            }
        }
        System.out.println("no of odd is "+odd);
        System.out.println("no. of even is "+even);
    }
}
