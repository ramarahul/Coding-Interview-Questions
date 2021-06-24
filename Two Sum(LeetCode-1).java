class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums.length==0) return ans;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return ans;
    }
}
