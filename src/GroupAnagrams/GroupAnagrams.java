package GroupAnagrams;

// 49

class GroupAnagrams {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }).toString());
      System.out.println(s.groupAnagrams(new String[] { "" }).toString());
      System.out.println(s.groupAnagrams(new String[] { "a" }).toString());
      System.out.println(s.groupAnagrams(new String[] { "act", "god", "cat", "dog", "tac" }).toString());
      System.out.println(s.groupAnagrams(new String[] { "no", "on", "is" }).toString());
      System.out.println(s.groupAnagrams(new String[] { "listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art" }).toString());
   }
}