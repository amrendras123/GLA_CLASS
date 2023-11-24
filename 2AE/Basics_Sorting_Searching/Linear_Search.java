import java.util.Scanner;

/**
 * Linear_Search
 */
public class Linear_Search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        // search(arr,ele);
       System.out.println( search1(arr, ele));
    }
    public static int search1(int[] arr,int ele){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;

    }
    
    public static void search(int[] arr,int ele){
        int cnt=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
        
                cnt++;
                break;
            }
        }
        if(cnt>0)
        System.out.println(" present");
        else
        System.out.println("not present");
    }
}