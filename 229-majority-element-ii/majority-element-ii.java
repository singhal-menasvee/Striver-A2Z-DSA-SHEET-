class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res= new ArrayList<>();
        Map<Integer,Integer> count= new HashMap<>();
        int stop=nums.length/3+1;
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);

            if(count.get(nums[i])==stop){
                res.add(nums[i]);
            }
            if(res.size()==2){
                break;
            }
        }
        return res;
        
    }
}