package SubarraySumEqualsK;

// 560

public class SubarraySumEqualsK{
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.subarraySum(new int[]{1,1,1},2));
      System.out.println(s.subarraySum(new int[]{1,2,3},3));
      System.out.println(s.subarraySum(new int[]{1,-1,0},0));
      System.out.println(s.subarraySum(new int[]{1,2,1,2,1},3));
   }
}