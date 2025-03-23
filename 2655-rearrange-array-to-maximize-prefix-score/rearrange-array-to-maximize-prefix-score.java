import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int maxScore(int[] nums) {
        // Sort the array in descending order
        Arrays.sort(nums); // Sort in ascending order first
        int n = nums.length;
        
        // Reverse the array to get descending order
        int[] sortedNums = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNums[i] = nums[n - i - 1];
        }

        int count = 0;
        long sum = 0;
        
        // Iterate from largest to smallest
        for (int num : sortedNums) {
            sum += num;
            if (sum > 0) count++; // Only count if sum remains positive
            else break; // Stop when sum becomes non-positive
        }
        return count;
    }
}
