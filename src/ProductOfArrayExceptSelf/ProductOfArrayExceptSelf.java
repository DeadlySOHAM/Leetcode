package ProductOfArrayExceptSelf;

import java.util.*;

// 238

public class ProductOfArrayExceptSelf {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(Arrays.toString(s.productExceptSelf(new int[]{10, 3, 5, 6, 2})));
      System.out.println(Arrays.toString(s.productExceptSelf(new int[]{12,0})));
      System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
      System.out.println(Arrays.toString(s.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
      System.out.println(Arrays.toString(s.productExceptSelf(new int[]{-1, 1, 0, -3, 0, 3})));
   }
}
