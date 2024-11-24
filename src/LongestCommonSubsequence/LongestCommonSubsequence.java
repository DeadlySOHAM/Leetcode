package LongestCommonSubsequence;

// 1143

class LongestCommonSubsequence {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.longestCommonSubsequence("abcde", "ace")); // 3
      System.out.println(s.longestCommonSubsequence("abc", "abc")); // 3
      System.out.println(s.longestCommonSubsequence("abc", "def")); // 0
      System.out.println(s.longestCommonSubsequence("abc","cadb")); // 2
      System.out.println(s.longestCommonSubsequence("pqr","tpuqvr")); // 3
   }
}