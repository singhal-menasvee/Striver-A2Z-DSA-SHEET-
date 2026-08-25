class Solution {
    public int splitArray(int[] nums, int k) {
        int low=max(nums);
        int high= sum(nums);
        int ans=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            int split= calculateSum(nums,k,mid);
            if(split>k){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;

            }
        }
        return ans;

        
    }
    public static int calculateSum(int[] nums, int k,int mid){
        int currentSum=0;
        int number= 1;
        for(int i=0;i<nums.length;i++){
            if(currentSum+nums[i]<=mid){
                currentSum+=nums[i];
            }
            else{
                currentSum=nums[i];
                number++;
            }

            
        }
        return number;
    }
    public static int max(int[] arr){
        int maximum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maximum= Math.max(maximum,arr[i]);
        }
        return maximum;
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}