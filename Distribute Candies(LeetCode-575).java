class Solution {
    public int distributeCandies(int[] candies) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int c : candies){
            set.add(c);
        }
        
        return Math.min(candies.length/2,set.size());
        
    }
}
