package FactorialTrailingZeros;

// 172

class FactorialTrailingZeros {
   public static void main(String args[]) {
      Solution s = new Solution();
      for(int i=0;i<=25;i++)
         System.out.println(i+" :: "+s.trailingZeroes(i));
   }
}