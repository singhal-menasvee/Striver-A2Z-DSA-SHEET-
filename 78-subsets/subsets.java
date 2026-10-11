class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subset= new ArrayList<>();

        createSubsets(nums, 0, ans,subset);
        return ans;






        
    }
    private void createSubsets(int[] nums, int i, List<List<Integer>> ans, List<Integer> subset){

        if(i==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }



        //take element
        subset.add(nums[i]);
        createSubsets(nums,i+1,ans,subset);

        //not take
        subset.remove(subset.size()-1);
        createSubsets(nums,i+1,ans,subset);
    }
}