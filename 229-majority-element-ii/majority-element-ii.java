class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res= new ArrayList<>();
        
       for(int i=0;i<nums.length;i++){
        if(res.contains(nums[i])) continue;
        int count=1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==nums[i]){
                count++;
            }
            


        }
        if(count>nums.length/3) res.add(nums[i]);
       }
       return res;

        
        


        
    }
}