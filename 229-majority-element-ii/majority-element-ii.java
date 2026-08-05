class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int count1=0;
       int maj1=-1;
       int count2=0;
       int maj2=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==maj1){
            count1++;
        }
        else if(nums[i]==maj2){
            count2++;
        }
        else if(count1==0 && nums[i]!=maj2){
            maj1=nums[i];
            count1=1;
        }
        else if(count2==0 && nums[i]!=maj1){
            maj2=nums[i];
            count2=1;
        }
        else{
            count1--;
            count2--;
        }
       }

       List<Integer> ans= new ArrayList<>();
       int freq1=0;
       int freq2=0;
       for(int num:nums){
        if(num==maj1){
            freq1++;
        }
        if(num==maj2){
            freq2++;
        }
       }
       if(freq1>nums.length/3){
        ans.add(maj1);
       }
       if(maj2!=maj1 && freq2>nums.length/3){
        ans.add(maj2);
       }
       return ans;
        
    }
}