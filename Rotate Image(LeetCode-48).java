class Solution {
    public void rotate(int[][] matrix) {
        
      //First horizontally flip the matrix
      int start = 0;
      int end = matrix.length -1;
      while(start<end){
        int[] temp = matrix[start];
        matix[start] = matrix[end];
        matrix[end] = temp;
      }
      
      //Then transpose the matrix or in other words flip it diagonally
      for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix[i].length;j++){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = matrix[i][j];
        }
      }
        
    }
}
