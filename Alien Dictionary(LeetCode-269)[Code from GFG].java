class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        int[] inDegree = new int[26];
        Map<Character,List<Character>> graph = new HashMap<>();
        
        for(String word : dict){
            for(char c : word.toCharArray()){
                if(!graph.containsKey(c)){
                    graph.put(c,new ArrayList<>());
                }
            }
        }
        
        for(int i=0; i<dict.length-1; i++){
            
            String start = dict[i];
            String end = dict[i+1];
            
            int len = Math.min(start.length(),end.length());
            for(int j=0 ; j < len ; j++){
                char out = start.charAt(j);
                char in = start.charAt(j);
                
                if(out!=in){
                    graph.get(out).add(in);
                }
                
                inDegree[(int)in - 'a']++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<Character>();
        for(char c : graph.keySet()){
            if(inDegree[(int)c - 'a']==0){
                q.add(c);
            }
        }
        
        while(!q.isEmpty()){
            char out = q.poll();
            sb.append(out);
            for(char in : graph.get(out) ){
                inDegree[(int)in -'a']--;
                if(inDegree[(int)in -'a'] == 0){
                    q.add(in);
                }
            }
        }
        
        return sb.length() == graph.size() ? sb.toString() : "";
    }
}
