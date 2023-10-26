/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int ele=18;
        binary(arr, ele);

    }
    public static void binary(int[] arr,int ele){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;

            if(arr[mid]==ele){
                System.out.println("element found at "+mid);
                return ;

            }else if(arr[mid]<ele){
                      lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
       if(lo>hi){
        System.out.println("element no found");
       }
    }
}