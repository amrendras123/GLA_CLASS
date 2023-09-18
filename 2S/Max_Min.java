import java.util.Scanner;

/**
 * Max_Min
 */
public class Max_Min {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size f Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value of Array :");

        // char[] arra1=new char[5];
        // arra1[0]='a';
        // System.out.println(arra1[0]);
        // System.out.println(arra1[1]);
         
        for(int i=0;i<=arr.length-1;i++){
                    arr[i]=sc.nextInt();

        }
        // int ans=max(arr);
        // System.out.println(ans);
        System.out.println("max of the array is "+max(arr));
        System.out.println("min of the array is "+min(arr));
        evenodd(arr);
                System.out.println(arr[5]);

        
    }
    public static void evenodd(int[] arr){
        int even=0;
        int odd=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("no. of odd is "+odd);
        System.out.println("no. of even is "+even);

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