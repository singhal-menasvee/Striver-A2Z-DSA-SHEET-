class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        int count=1;
        int maxCount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=1;
            }
        }
        return maxCount;

        
        
    }
}