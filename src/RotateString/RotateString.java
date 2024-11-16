package RotateString;

// 796

class RotateString{
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.rotateString("abcd", "dabc")); // true
      System.out.println(s.rotateString("abcd", "acbd")); // false
      System.out.println(s.rotateString("aab", "aba")); // true
      System.out.println(s.rotateString("a", "aa")); // false
   }
}