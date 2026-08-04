class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans= new ArrayList<>();
        boolean[] numbers= new boolean[101];
        int l=101; 
        int r=0;
        for(int i=0;i<nums.length;i++){
            l= Math.min(l,nums[i]);
            r=Math.max(r,nums[i]);
            numbers[nums[i]]=true;

        }
        for(int i=l;i<=r;i++){
            if(!numbers[i]){
                ans.add(i);
            }
        }
        return ans;
       
        

        
    }
}