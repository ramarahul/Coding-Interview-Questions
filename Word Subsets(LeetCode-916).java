class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] maxB = new int[26];
        
        for(String b : B){
            int[] f = new int[26];
            for(char c : b.toCharArray()){
                f[c - 'a']++;
            }
            
            for(int i = 0; i<26;i++){
                maxB[i] = Math.max(maxB[i],f[i]);
            }
        }
        
        List<String> result = new ArrayList<String>();
        
        for(String a: A){
            int[] f = new int[26];
            for(char c : a.toCharArray()){
                f[c-'a']++;
            }
            if(isUniversal(f,maxB)){
                result.add(a);
            }
        }
        
        return result;
    }
    
    private boolean isUniversal(int[] f, int[] maxB){
        for(int i=0;i<26;i++){
            if(f[i]<maxB[i]){
                return false;
            }
        }
        
        return true;
    }
}
