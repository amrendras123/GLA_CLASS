public class Reverse {

    public static void main(String[] args) {

        // int arr[] = { 10, 20, 30, 40, 56, 57 };
        // System.out.println("before reverse ");
        // print(arr);
        // rev(arr);
        // System.out.println("after reverse ");
        // print(arr);

        int a=10;
        int b=20;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        swap(a,b);
        System.out.println("a is "+a);
        System.out.println("b is "+b);

    }

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        
    }













    public static void rev(int[] arr) {

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
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
