class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        
        int maxLongest=0;
        for(int i: set){
            if(!set.contains(i-1)){
                int begin=i;
                int count=1;
                while(set.contains(begin+1)){
                    begin++;
                    count++;
                }
                maxLongest= Math.max(maxLongest,count);

            }
            
        }
        return maxLongest;
        

        
        
    }
}