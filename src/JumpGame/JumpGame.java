package JumpGame;

public class JumpGame {
   public static void main(String[] args) {
      int[] arr = {2,3,1,1,4}, arr2 = {2,3,0,1,4}, arr3 = {1,2}, arr4 = {1,2,3}, arr5 = {0};
      Solution solution = new Solution();
      System.out.println(solution.jump(arr));
      System.out.println(solution.jump(arr2));
      System.out.println(solution.jump(arr3));
      System.out.println(solution.jump(arr4));
      System.out.println(solution.jump(arr5));
   }
}
