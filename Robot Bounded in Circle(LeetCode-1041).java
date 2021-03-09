class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int x = 0, y = 0, dir = 0;
        int[][] moves = {{0,1},{1,0},{0,-1},{-1,0}};
        
        for(int i=0; i<instructions.length();i++){
            char c = instructions.charAt(i);
            if(c=='G'){
                x+= moves[dir][0];
                y+= moves[dir][1];
            }
            else if(c=='L'){
                dir = (dir+3)%4;
            }
            else if(c=='R'){
                dir = (dir+1)%4;
            }
        }
        
        return (x==0 && y==0) || dir>0;
        
    }
}
