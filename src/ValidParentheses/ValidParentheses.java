package ValidParentheses;

class ValidParentheses{
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isValid("()"));
      System.out.println(s.isValid("()[]{}"));
      System.out.println(s.isValid("(]"));
      System.out.println(s.isValid("([])"));
      System.out.println(s.isValid("([)]"));
   }
}