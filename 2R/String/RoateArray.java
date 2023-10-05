public class RoateArray {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6};
        int k=30001;
        k=k%arr.length;
        print(arr);
        rev(arr, 0, arr.length-1);
        rev(arr, 0, k-1);
        rev(arr, k, arr.length-1);
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
