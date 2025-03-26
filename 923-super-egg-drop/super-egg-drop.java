class Solution {
    public int superEggDrop(int k, int n) {
        // DP Table: dp[m][k] -> max floors we can check with m moves and k eggs
        int[][] dp = new int[n + 1][k + 1];
        int moves = 0;

        // Keep increasing moves until we can check at least `n` floors
        while (dp[moves][k] < n) {
            moves++;
            for (int eggs = 1; eggs <= k; eggs++) {
                dp[moves][eggs] = 1 + dp[moves - 1][eggs - 1] + dp[moves - 1][eggs];
            }
        }
        return moves;
    }
}
