class Solution {
    public int maxProduct(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int leftProduct=1;
        int rightProduct=1;
        int ans=nums[0];
        while(left<=nums.length-1 && right>=0){
            leftProduct*=nums[left];
            rightProduct*=nums[right];
            ans=Math.max(Math.max(leftProduct,rightProduct),ans);
            if(leftProduct==0) leftProduct=1;
            if(rightProduct==0) rightProduct=1;
            left++;
            right--;
        }
        return ans;

        


        
        
        
        
    }
}