class Solution {
    public int missingNumber(int[] nums) {
        
        int actualSum = 0;
        int expectedSum = (nums.length * (nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }
        
        int ans = expectedSum - actualSum;
        
        return ans;
        
    }
}
