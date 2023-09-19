public class Binary {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        int ele=50;
        binary(arr, ele);
        
        
    }
    public static void binary(int[] arr,int ele){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==ele){
                System.out.println("found at index "+mid);
                break;

            }else if(arr[mid]>ele){
                ei=mid-1;

            }else{
                si=mid+1;

            }
        }
        if(si>ei){
            System.out.println("not found");
        }
    }
}
