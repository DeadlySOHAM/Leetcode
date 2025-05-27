package WildcardStringMatching;

// 44 

class WildcardStringMatching {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isMatch("geeks", "ge*ks"));
      System.out.println(s.isMatch("geeksforgeeks", "ge?ks*"));
      System.out.println(s.isMatch("geeksforgeeks", "ge?ks*geeks"));
      System.out.println(s.isMatch("aa", "a"));
      System.out.println(s.isMatch("aa", "*"));
      System.out.println(s.isMatch("abcdefgefg", "a?c*e?g"));
      System.out.println(s.isMatch("abcdefefg", "a?c*e*e*g"));
      System.out.println(s.isMatch("cb", "?a"));
      System.out.println(s.isMatch("cb", "?b"));
      System.out.println(s.isMatch("lpaeazufqjpukznluqiwxaexhoyqmtdoyznunkdkbeamaobyduipulozebdbxdfbeagmnbtuelnit",
            "lpaeazufqjpukznluqiwxaexhoyqmtdo?znun?dkbeama?bydu*?ulozebd?xdfbeagmnbtuelni?"));// true

      System.out.println(s.isMatch("oyznkdaobuipudbxit",
            "o?zn?da?bu*?ud?xi?"));// true

      System.out.println(s.isMatch("zvulnszmtupidyinxwlzmqbppkyhbwxenscagsjzjdvtiyhuipxdnvcoreahha",
            "zvulnszmtupidyinxwlzmqbppkyhbwx?nscagsjzjd*tiyhuipxd**coreahha")); // true

      System.out.println(s.isMatch("abcabczzzde", "*abc???de*")); // true
      
      System.out.println(s.isMatch("", "****")); // true
      System.out.println(s.isMatch("acdcb", "a*c?b")); // false  
      System.out.println(s.isMatch("mississippi", "m??*ss*?i*pi")); // false  
      System.out.println(s.isMatch("abbbb", "?*b**"));
   }
}