class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        
        if(d>jobDifficulty.length) return -1;
        
        int[] dp = new int[jobDifficulty.length+1];
        Arrays.fill(dp,300001);
        
        dp[jobDifficulty.length] = 0;
        for(int i=1;i<=d;i++){
            for(int j=0;j<=jobDifficulty.length -i;j++){
                int maxd = 0;
                dp[j] = 300001;
                for(int k=j;k<=jobDifficulty.length -i;k++){
                    maxd = Math.max(maxd, jobDifficulty[k]);
                    dp[j] = Math.min(dp[j], maxd+ dp[k+1]);
                }
            }
        }
        
        return dp[0];
        
    }    
}
