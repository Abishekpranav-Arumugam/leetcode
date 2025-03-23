import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums); 

        int count = 0;
        long sum = 0;
     int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = nums[nums.length - i - 1];
        }
        for (int num : sortedNums) {
            sum += num;
            if (sum > 0) count++; 
            else break; 
        }

        return count;
    }
}
