class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        Set<Integer> set = new HashSet<>();
        set.add(distanceBetweenTwoPoints(p1,p2));
        set.add(distanceBetweenTwoPoints(p1,p3));
        set.add(distanceBetweenTwoPoints(p1,p4));
        set.add(distanceBetweenTwoPoints(p2,p3));
        set.add(distanceBetweenTwoPoints(p2,p4));
        set.add(distanceBetweenTwoPoints(p3,p4));
        
        return !set.contains(0) && set.size()==2;
    }
    
    public int distanceBetweenTwoPoints(int[] p1, int[] p2){
        int x1 = p1[0];
        int x2 = p2[0];
        int y1 = p1[1];
        int y2 = p2[1];
        
        int distance = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);
        
        return distance;
    }
}
