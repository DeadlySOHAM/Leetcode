package MinimumSwapsToSortByDigitSum;

public class MinimumSwapsToSortByDigitSum {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.minSwaps(new int[]{2,8,4})); // 1
      System.out.println(s.minSwaps(new int[]{1,3,4,5,6})); // 0
      System.out.println(s.minSwaps(new int[]{2,4,5,1,3})); // 3
      System.out.println(s.minSwaps(new int[]{37,100})); // 1
      System.out.println(s.minSwaps(new int[]{22,14,33,7})); // 0
      System.out.println(s.minSwaps(new int[]{18,43,34,16})); // 2
   }
}
