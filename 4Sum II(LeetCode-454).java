class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0;
        
        for(int d : D)
            for(int c : C)
                map.put(c+d, map.getOrDefault(c+d,0)+1);
        
        for(int a : A)
            for(int b : B)
                count+= map.getOrDefault(-(a+b),0);
        
        return count;
    }
}
