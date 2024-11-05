package BuySellStock2;

// 122

public class BuySellStock2 {
   public static void main(String[] args){
      // Solution solution = new Solution();
      Solution3 solution = new Solution3();
      System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
      System.out.println(solution.maxProfit(new int[]{7,6,5,4,3,2,1}));
      System.out.println(solution.maxProfit(new int[]{1,2,3,4,6,7}));
      System.out.println(solution.maxProfit(new int[]{3,4,1,5}));
      System.out.println(solution.maxProfit(new int[]{1,3,5,7,9}));
      System.out.println(solution.maxProfit(new int[]{100,180,260,310,40,535,695}));
      System.out.println(solution.maxProfit(new int[]{1,2,0,3,4,0,5,6,0}));
   }
}
