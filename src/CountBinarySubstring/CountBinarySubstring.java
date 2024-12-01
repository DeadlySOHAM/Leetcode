package CountBinarySubstring;

// 696

public class CountBinarySubstring {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.countBinarySubstrings("0000000000")); // 0
      System.out.println(s.countBinarySubstrings("00110011")); // 6
      System.out.println(s.countBinarySubstrings("10101")); // 4
      System.out.println(s.countBinarySubstrings("00100")); // 2
      System.out.println(s.countBinarySubstrings("100111001")); // 6
   }
}
