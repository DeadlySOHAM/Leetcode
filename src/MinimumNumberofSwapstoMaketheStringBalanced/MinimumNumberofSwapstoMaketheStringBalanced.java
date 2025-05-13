package MinimumNumberofSwapstoMaketheStringBalanced;

// 1963

public class MinimumNumberofSwapstoMaketheStringBalanced {

   public static void main(String args[]) {
      Solution s = new Solution();
      System.out.println(s.minSwaps("][]["));
      System.out.println(s.minSwaps("]][[]["));
      System.out.println(s.minSwaps("][]][["));
      System.out.println(s.minSwaps("][][[]"));
      System.out.println(s.minSwaps("]]][[["));
      System.out.println(s.minSwaps("[]"));
   }
   
}
