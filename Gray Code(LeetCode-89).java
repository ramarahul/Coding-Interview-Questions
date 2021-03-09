class Solution{
  public List<Integer> grayCode(int n){
    List<Integer> res = new ArrayList<Integer>();
    res.add(0); //GrayCode starts with zero
    for(int i=0;i<n;i++){
      int size = res.size();
      for(int k=size-1;k>=0;k--){
        res.add(res.get(k) | 1<<k); //Change most-significant bit to 1 in reverse order of the result stored till then
      }
    }
    return res;
  }
}
