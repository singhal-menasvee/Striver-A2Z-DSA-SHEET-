class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;

        int maj1 = -1;
        int maj2 = -1;

        // Phase 1: Find candidates
        for (int num : nums) {

            if (count1 == 0 && num != maj2) {
                maj1 = num;
                count1 = 1;
            }
            else if (count2 == 0 && num != maj1) {
                maj2 = num;
                count2 = 1;
            }
            else if (num == maj1) {
                count1++;
            }
            else if (num == maj2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify candidates
        int freq1 = 0;
        int freq2 = 0;

        for (int num : nums) {
            if (num == maj1)
                freq1++;
            else if (num == maj2)
                freq2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (freq1 > nums.length / 3)
            ans.add(maj1);

        if (freq2 > nums.length / 3)
            ans.add(maj2);

        return ans;
    }
}