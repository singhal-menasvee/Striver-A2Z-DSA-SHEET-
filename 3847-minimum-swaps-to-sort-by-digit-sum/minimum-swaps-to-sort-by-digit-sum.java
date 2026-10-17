import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Store digit sum, number, and original index
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = sum;
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }

        // Sort by digit sum, then by original number
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Count swaps using cycle detection
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][2];
                cycleLength++;
            }

            swaps += cycleLength - 1;
        }

        return swaps;
    }
}