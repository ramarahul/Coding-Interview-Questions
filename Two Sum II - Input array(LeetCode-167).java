class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            if(numbers[start]<target-numbers[end]){
                start++;
            }
            if(numbers[start]>target-numbers[end]){
                end--;
            }
            if(numbers[start]==target-numbers[end]){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
        }
      
        return ans;
    }
}
