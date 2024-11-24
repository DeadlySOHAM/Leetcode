package LongestCommonSubsequence;

public class Solution {

   public int longestCommonSubsequence(String text1, String text2) {
      int[][] dp = new int[text1.length()][text2.length()];
      return recursivePoint(text1, text2, 0, 0, dp);
   }

   private int recursivePoint(String text1, String text2, int dx, int dy,int[][] dp) {
      if(dx>=text1.length() || dy>=text2.length() || dp[dx][dy]==Integer.MIN_VALUE ) return 0;
      else if(dp[dx][dy]!=0) return dp[dx][dy];
      int result = 0;
      if(text1.charAt(dx)==text2.charAt(dy)) result = 1+recursivePoint(text1, text2, dx+1, dy+1, dp);
      else result = Math.max(recursivePoint(text1, text2, dx+1, dy, dp),recursivePoint(text1, text2, dx, dy+1, dp));
      dp[dx][dy] = result==0?Integer.MIN_VALUE : result;
      return result;
   }
}
