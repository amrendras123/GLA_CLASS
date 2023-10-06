public class MaxSubarray {
    
    public static void main(String[] args) {
        int[] arr={2,-4,5,6,-10,8,9,-110};
        System.out.println(subArray(arr));
    }
    public static int subArray(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    } 
}
