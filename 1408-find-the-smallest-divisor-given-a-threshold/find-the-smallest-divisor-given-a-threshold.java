class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high= max(nums);
        int ans=Integer.MIN_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int req= calculate(nums,mid);
            if(req<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static int max(int[] nums){
        int maximum= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maximum=Math.max(maximum,nums[i]);


        }
        return maximum;
    }
    public static int calculate(int[] nums, int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double) nums[i]/(double) mid);
        }
        return sum;
        
    }
}