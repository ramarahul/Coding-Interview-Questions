class Solution {
    public String reorganizeString(String s) {
        
        int[] alphabet = new int[26];
        
        for(char c : s.toCharArray()){
            alphabet[c - 'a'] ++;
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> alphabet[b-'a']-alphabet[a-'a']);
        
        for(int i=0;i<s.length();i++){
            if(!maxHeap.contains(s.charAt(i)))
                maxHeap.add(s.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        while(maxHeap.size()>1){
            char curr = maxHeap.remove();
            char next = maxHeap.remove();
            result.append(curr);
            result.append(next);
            alphabet[curr - 'a']--;
            alphabet[next - 'a']--;
            if(alphabet[curr - 'a']>0) maxHeap.add(curr);
            if(alphabet[next - 'a']>0) maxHeap.add(next);
        }
        
        if(!maxHeap.isEmpty()){
            char lastChar = maxHeap.remove();
          if(alphabet[lastChar - 'a']>1){
              return "";
          }
            else{
                result.append(lastChar);
            }
        } 
        
        return result.toString();
    }
}
