public class Rotate {
    
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int len=arr.length;
        int k=9000000;
        k=k%len;
        System.out.println("Number of time need to rotate the array "+k);
        rev(arr, 0, len-1);
        rev(arr, 0, k-1);
        rev(arr, k, len-1);
        print(arr);
        
    }
    public static void rev(int[] arr,int si,int ei){

        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
