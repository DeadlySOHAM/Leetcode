package LongestHappyPrefix;

// 1392

public class LongestHappyPrefix {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println("abab ::: " + s.longestPrefix("abab"));
      System.out.println("bbaddaccad ::: " + s.longestPrefix("bbaddaccad")); // empty
      System.out.println("ddbbbbcddd ::: " + s.longestPrefix("ddbbbbcddd"));
      System.out.println("level ::: " + s.longestPrefix("level"));
      System.out.println("aabcaab ::: " + s.longestPrefix("aabcaab"));
      System.out.println("aabdeaacb ::: " + s.longestPrefix("aabdeaacb")); // empty
      System.out.println("a ::: " + s.longestPrefix("a"));
      System.out.println("aa ::: " + s.longestPrefix("aa"));
      System.out.println("aaaa ::: " + s.longestPrefix("aaaa"));
      System.out.println("soham ::: " + s.longestPrefix("soham"));
   }
}
