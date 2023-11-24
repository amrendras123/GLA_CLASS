public class Binary {
    public static void main(String[] args) {
        
        int[] arr={1,3,4,5,6,7,89,90};
        b_search(arr, 87);

    }
    public static void b_search(int[] arr,int ele){

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
            System.out.println("not present");
        }
    }
}
