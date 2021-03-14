class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> groupedAnagrams  = new ArrayList<>();
      Map<String, List<String>> map = new HashMap<>();
      
      for(String str : strs){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if(!map.containsKey(sorted)){
          map.put(sorted,new ArrayList<String>());
        }
        
        map.get(sorted).add(str);
      }
      
      groupedAnagrams.addAll(map.values());
      
      return groupedAnagrams;
    }
}
