public class Palindrome {
    
    public static void main(String[] args) {
        
        int[] arr={1,1,2,2,2,1,1};

    //    int count= palindrome(arr);
    //     if(count>0){
    //          System.out.println("not a Palindrome Array ");
    //     }else
    //     System.out.println("Palindrome Array ");


    //    boolean ans= palindrome_bool(arr);
    //    if(ans==true){
    //     System.out.println("palindrome");
    //    }else{
    //     System.out.println("not a Plaindrome");
    //    }

   boolean ans= is_Palindrome(arr);
        if(ans==true){
            System.out.println("palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
    public static boolean is_Palindrome(int[] arr){
        int i=0;
        int j=arr.length-1;
        boolean ispalindrome=true;

        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{
                ispalindrome=false;
                break;

            }
        }
        return ispalindrome;

    }
        public static void palindrome_void(int[] arr){
        int cnt=0;
       int n=arr.length;
        for(int i=0;i<=(arr.length-1)/2;i++){

            if(arr[i]!=arr[n-i-1]){
               cnt++;
                break;

            }
        }
         if(cnt>0){
             System.out.println("not a Palindrome Array ");
        }else
        System.out.println("Palindrome Array ");
        
       

    }
    public static int palindrome(int[] arr){
        int cnt=0;
       int n=arr.length;
        for(int i=0;i<=(arr.length-1)/2;i++){

            if(arr[i]!=arr[n-i-1]){
               cnt++;
                break;

            }
        }
        return cnt;
       

    }
    public static boolean palindrome_bool(int[] arr){
    
       int n=arr.length;
       boolean is_palindrome=true;
        for(int i=0;i<=(arr.length-1)/2;i++){

            if(arr[i]!=arr[n-i-1]){
               is_palindrome=false;
                break;

            }
        }
        return is_palindrome;
       

    }
    
}
