package EditDistance;

class Solution {
   
   public int minDistance(String word1, String word2) {
      int[][] memory = new int[word1.length()][word2.length()];
      return recurse(word1, word2, 0,0,memory);
   }

   public int recurse(String src, String dest, int i, int j, int[][] memory) {

      if(i==src.length()) return dest.length()-j;
      if(j==dest.length()) return src.length()-i;
      
      if(memory[i][j]!=0) return memory[i][j];

      int result = 0;
      if(src.charAt(i)==dest.charAt(j)) result = recurse(src, dest, i+1, j+1,memory);
      else {
         int
            replace = recurse(src, dest, i+1, j+1,memory),
            insert = recurse(src, dest, i,j+1,memory),
            delete = recurse(src,dest,i+1,j,memory);
         result = 1+Math.min(replace,Math.min(insert,delete));
      }
      memory[i][j] = result;
      return result;
   }

}