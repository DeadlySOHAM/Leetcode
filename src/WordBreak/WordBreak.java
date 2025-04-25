package WordBreak;

import java.util.Arrays;

// 139

public class WordBreak {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.wordBreak("leetcode", Arrays.asList("leet","code"))); // true
      System.out.println(s.wordBreak("applepenapple", Arrays.asList("apple","pen"))); // true
      System.out.println(s.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat"))); // false
      System.out.println(s.wordBreak("catsanddog", Arrays.asList("cats","dog","sand","cat"))); // true
      System.out.println(s.wordBreak("aaaaaaa", Arrays.asList("aaaa","aaa"))); // true
      System.out.println(s.wordBreak("geeksforgeeks", Arrays.asList("geeks","for"))); // true
      System.out.println(s.wordBreak(
         "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
         Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")
         )); // false
   }
}

