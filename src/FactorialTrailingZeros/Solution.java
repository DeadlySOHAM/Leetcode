package FactorialTrailingZeros;

class Solution {
   public int trailingZeroes(int n) {
      if (n < 5)
         return 0;
      int result = 0;
      for (int i = 5; i <= n; i *= 5) {
         int x = n / i;
         if (x == 0)
            return result;
         result += x;
      }
      return result;
   }
}