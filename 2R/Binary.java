public class Binary {
    
    public static void main(String[] args) {
        int[] arr={10,20,23,24,25,26,45,56,67,89};
        int ele=10;


        Binary_Search(arr,ele);
    }

    public static void Binary_Search(int[] arr,int ele){
        int si=0;
        int ei=arr.length-1;

        while(si<=ei){

            int mid=(si+ei)/2;
            if(arr[mid]==ele){
                System.out.println("element found at index "+mid);
                break;

            }else if(arr[mid]>ele){
                ei=mid-1;

            }else{
                si=mid+1;

            }
        }
        if(si>ei){
            System.out.println("element not found");
        }
    }
}
