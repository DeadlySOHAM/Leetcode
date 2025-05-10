package Roman2Integer;

class Solution {
   public int romanToInt(String s) {
      int i = 0, sum = 0, diff = 0;
      if (s.length() < 2)
         return getBasicRoman(s.charAt(0));
      for (i = 0; i < s.length() - 1; i++) {
         if (getBasicRoman(s.charAt(i)) < getBasicRoman(s.charAt(i + 1))) {
            diff = getBasicRoman(s.charAt(i + 1)) - getBasicRoman(s.charAt(i));
            sum += diff;
            ++i;
         } else {
            sum += getBasicRoman(s.charAt(i));
         }
      }
      int lastDigit = getBasicRoman(s.charAt(s.length() - 1));
      int secondLastDigit = getBasicRoman(s.charAt(s.length() - 2));
      if (lastDigit <= secondLastDigit)
         sum += lastDigit;
      return sum;
   }

   private int getBasicRoman(char s) {
      switch (s) {
         case 'I':
            return 1;
         case 'V':
            return 5;
         case 'X':
            return 10;
         case 'L':
            return 50;
         case 'C':
            return 100;
         case 'D':
            return 500;
         case 'M':
            return 1000;
         default:
            return -1;
      }
   }
}
