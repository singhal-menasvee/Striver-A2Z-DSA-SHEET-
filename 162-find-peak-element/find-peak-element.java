class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is less than its right neighbor, 
            // a peak must exist on the right side.
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, a peak exists on the left side (including mid).
                right = mid;
            }
        }
        
        return left;
    }
}