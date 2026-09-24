class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0; //pointer to place non-zeros
        //this pointer to scan over the elements
        for(int j=0;j<nums.length;j++){
            //find a non-zero->swap it
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;

            }
        }
        
        
    }
}