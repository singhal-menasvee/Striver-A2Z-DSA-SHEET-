class Solution {
    public int findMaxLength(int[] nums) {
         
        int maxLen=0;
       int prefixSum=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            prefixSum-=1;
        }
        else{
            prefixSum+=1;
        }
        if(map.containsKey(prefixSum)){
            maxLen=Math.max(maxLen,i-map.get(prefixSum));
        }else{
        map.put(prefixSum,i);
        }
       }
       return maxLen;

        
    }
}