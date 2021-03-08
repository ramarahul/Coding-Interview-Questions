class Solution{
  public boolean carPooling(int[][] trips, int capacity){
    int[] timestamp = new int[1001]; //Distance limit given as thousand
    for(int[] t: trips){
      timestamp[t[1]] += t[0];
      timestamp[t[2]] -= t[0];
    }
    
    for(int number : timestamp){
      capacity -= number; //Subtract number of passengers in the car at all timestamps(boarding - getting off)
      if(capacity<0){
        return false;
      }
    }
    
    return true;
  }
}
