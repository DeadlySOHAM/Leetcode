package LongestContinuousSubsequence;

// 123

public class LongestContinuousSubsequence {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.longestConsecutive(new int[] {34, 2, 7, 23, 31, 38, 13, 11, 37, 19, 45, 6}));
      System.out.println(s.longestConsecutive(new int[] {0,1,1,1,1,2}));
      System.out.println(s.longestConsecutive(new int[] {1,2,3}));
      System.out.println(s.longestConsecutive(new int[] {2,6,1,9,3,4,5}));
      System.out.println(s.longestConsecutive(new int[] {0,2,1,2,1})); 
   }
}
