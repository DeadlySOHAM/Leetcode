package Sum3Closest;

public class Sum3Closest {

   public static void main(String[] args){
      // int[] nums = {-1,2,1,-4};
      // int target = 1; 
      // boolean sol = new Solution().threeSumClosest(nums, target) == 2;
      int[] nums = {1,1,1,0};
      int target = -100;
      boolean sol = new Solution().threeSumClosest(nums, target) == 2;
      System.out.print(sol);
   }
   
}