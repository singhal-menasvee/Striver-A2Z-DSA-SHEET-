class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res= new ArrayList<>();
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else if(count1==0 && nums[i]!=candidate2){
                candidate1=nums[i];
                count1=1;

            }
            else if(count2==0 && nums[i]!=candidate1){
                candidate2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        int freq1=0;
        int freq2=0;
        for(int num:nums){
            if(num==candidate1) freq1++;
            else if(num==candidate2) freq2++;
        }

        if(freq1>nums.length/3) res.add(candidate1);
        if(freq2>nums.length/3) res.add(candidate2);

        return res;
        
       
       
      

        
        


        
    }
}