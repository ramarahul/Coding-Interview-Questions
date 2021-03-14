class Solution{
  public String longestPalindrome(String s){
    String max = "";
    
    for(int i=0;i<s.length();i++){
      String s1 = extend(s,i,i);
      String s2 = extend(s,i,i+1);
      max = s1.length() > max.length() ? s1 : max;
      max = s2.length() > max.length() ? s2 : max;
    }
    
    return max;
  }
  
  public String extend(String s, int i, int j){
    while(i >= 0 && j < s.length()){
      if(s.charAt(i)!=s.charAt(j)){
        break;
      }
      
      i--;
      j++;
    }
    
    return s.substring(i+1,j);
  }
}
