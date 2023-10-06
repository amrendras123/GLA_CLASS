public class MaxSubarraySum {
    
    public static void main(String[] args) {
        int[] arr={-1,2,3,4,45,-100};
        System.out.println(maxSubArray(arr));
        
    }
    public static int maxSubArray(int[] nums) {

        int sum=0;
        int max=nums[0];


        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
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
