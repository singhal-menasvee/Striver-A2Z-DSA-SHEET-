class Solution {
    public boolean canJump(int[] nums) {
        int Maxjumps=0;
        for(int i=0;i<nums.length;i++){
            if(i>Maxjumps){
                return false;
            }
            Maxjumps= Math.max(Maxjumps,i+nums[i]);
            
        }
        return true;
        
    }
}