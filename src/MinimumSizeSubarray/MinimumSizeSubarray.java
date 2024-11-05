package MinimumSizeSubarray;

// 209

public class MinimumSizeSubarray{
   public static void main(String[] args){
      Solution solution = new Solution();
      System.out.println(solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
      System.out.println(solution.minSubArrayLen(4,new int[]{1,4,4}));
      System.out.println(solution.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
      System.out.println(solution.minSubArrayLen(51,new int[]{1, 4, 45, 6, 0, 19}));
      System.out.println(solution.minSubArrayLen(100,new int[]{1, 10, 5, 2, 7}));
      System.out.println(solution.minSubArrayLen(11,new int[]{1, 2, 3, 4, 5}));
      System.out.println(solution.minSubArrayLen(15,new int[]{1, 2, 3, 4, 5}));
      System.out.println(solution.minSubArrayLen(6,new int[]{10, 2, 3}));
   }
}