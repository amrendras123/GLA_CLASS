import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of Array :");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("enter the values of Array :");

        // for (int i = 0; i <= arr.length - 1; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("before reverse function");
        // print(arr);
        // reverse(arr);
        // System.out.println("after reverse function");
        // print(arr);


        // int a=10;
        // int b=20;
        // System.out.println("a is "+a);//10
        // System.out.println("b is "+b);//20
        // swap(a,b);
        // System.out.println("a is "+a);
        // System.out.println("b is "+b);
        
        // System.out.println("before swapping ");
        // print(arr);//
        // Arr_swap(arr, 3, 4);
        // System.out.println("after swapping ");
        // print(arr);//


        int[] arr1={10,20,3,4,5,6,6,6,6,6,6,6};
        search(arr1, 6);
        count(arr1, 6);
        // int[] arr2={2,3,4,5,6,7};

        // swap2(arr1,arr2);
        // print(arr1);
        // System.out.println("for array 2");
        // print(arr2);

    }
        public static void count(int[] arr,int val){
        int cnt=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==val){
                cnt++;
            }
        }
      
        System.out.println(cnt);

    }

    public static void search(int[] arr,int val){
        int cnt=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==val){
                cnt++;
                break;
                
            }
        }
        if(cnt>0){
            System.out.println("yes present");
        }else{
            System.out.println("not present");
        }

    }












    public static void swap2(int[] arr1,int[] arr2){

        int[] temp=arr1;
        arr1=arr2;
        arr2=temp;

    }





    public static void Arr_swap(int[] arr1,int i,int j){

        int temp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;

    }

    public static void swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;
    }

    public static void reverse(int[] arr) {//two pointer approach 

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
