class Solution {
    public int rob(int[] nums) {
        
        int twoHouseTotal=0, oneHouseTotal=0, currTotal=0;
        
        for(int num : nums){
            currTotal = Math.max(twoHouseTotal+num, oneHouseTotal);
            twoHouseTotal = oneHouseTotal;
            oneHouseTotal = currTotal;
        }
        
        return currTotal;
        
    }
}
