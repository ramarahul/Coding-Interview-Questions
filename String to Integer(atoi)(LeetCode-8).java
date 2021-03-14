class Solution {
    public int myAtoi(String s) {
        
        long ans = 0;
        boolean isNegative = false;
        if(s.length()==0) return 0;
        int index = 0;
        while(index < s.length() && s.charAt(index)==' '){
            index++;
        }
        
        if (index < s.length() && s.charAt(index) == '-') {
            isNegative = true;
            index++;
        } else if (index < s.length() && s.charAt(index) == '+')
            index++;
        
        while(index< s.length() && (s.charAt(index)-'0'>=0 && s.charAt(index)-'0'<=9)){
            ans = ans *10 + s.charAt(index)-'0';
            
            if(ans>Integer.MAX_VALUE){
                return isNegative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            index++;
        }
        
        int res = (int) ans;
        
        return isNegative? -1 * res : res; 
    }
}
