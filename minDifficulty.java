class Solution {
     public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(d > n) return -1;

        int[][] dp = new int[n][d + 1];
        for(int[] e: dp) {
            Arrays.fill(e, -1);
        }
        int result = dfs(jobDifficulty, d, 0, dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    
    private int dfs(int[] jobDifficulty, int d, int index, int[][] dp) {
        if(index >= jobDifficulty.length && d == 0) return 0;
        if(index >= jobDifficulty.length || d == 0) return Integer.MAX_VALUE;
        if(dp[index][d] >= 0) {
            return dp[index][d];
        }
        int max = 0;
        int result = Integer.MAX_VALUE;
        for(int i = index; i < jobDifficulty.length; i++) {
            int next = dfs(jobDifficulty, d - 1, i + 1, dp);
            max = Math.max(max, jobDifficulty[i]);
            if(next == Integer.MAX_VALUE) continue;
            result = Math.min(result, max + next);
        }
        dp[index][d] = result;
        return result;
    }
}
