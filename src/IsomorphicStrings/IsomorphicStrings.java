package IsomorphicStrings;

// 205

class IsomorphicStrings {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isIsomorphic("aab", "xxy"));
      System.out.println(s.isIsomorphic("egg", "add"));
      System.out.println(s.isIsomorphic("aab", "xyz"));
      System.out.println(s.isIsomorphic("aac", "xyz"));
      System.out.println(s.isIsomorphic("vi", "re"));
      System.out.println(s.isIsomorphic("yktbvpmxnuo", "murlidsaris"));
      System.out.println(s.isIsomorphic("foo", "bar"));
      System.out.println(s.isIsomorphic("paper", "title"));
   }
}