package MinimumNumberofSwapstoMaketheStringBalanced;

class Solution {

   public int minSwaps(String s) {
      int count = 0;
      int max = 0;
      for (int i=0;i<s.length();i++) {
         count += s.charAt(i)==']'? 1 : -1;
         max = Math.max(max,count);
      }
      return (max+1)/2;
   }
}