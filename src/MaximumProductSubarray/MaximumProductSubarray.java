package MaximumProductSubarray;

public class MaximumProductSubarray {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.maxProduct(new int[]{2,3,-2,4}));
      System.out.println(s.maxProduct(new int[]{-2,0,-1}));
      System.out.println(s.maxProduct(new int[]{6, -3, -10, 0, 2}));
      System.out.println(s.maxProduct(new int[]{-1, -3, -10, 0, 60}));
      System.out.println(s.maxProduct(new int[]{-2,-3,-1}));
      System.out.println(s.maxProduct(new int[]{-2,-3,-1,-5}));
      System.out.println(s.maxProduct(new int[]{2,3,1,5,4}));
      System.out.println(s.maxProduct(new int[]{-4,1,2,-3,5}));
      System.out.println(s.maxProduct(new int[]{0,0,0,-5,0,0}));
      System.out.println(s.maxProduct(new int[]{2,3,4,5,-1,0}));
      System.out.println(s.maxProduct(new int[]{8,-2,-2,0,8,0,-6,-8,-6,-1})); // 288
      System.out.println(s.maxProduct(new int[]{0,2,-1,3,4,0,2}));
      System.out.println(s.maxProduct(new int[]{3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28}));
   }
}
