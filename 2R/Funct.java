import java.util.Arrays;

public class Funct {
    public static void main(String[] args) {
        
        int[] arr={67,78,90,1,2,43,5,6};

        int ele=67;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==ele){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("yes it available");
        }else{
            System.out.println("not present");
        }
















        // Arrays.sort(arr);
        // for(int i=0;i<=arr.length-1;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println(Math.max(10,20));
        // System.out.println(Math.min(23,34.5));
        // System.out.println(Math.pow(2,3));
    }
}
