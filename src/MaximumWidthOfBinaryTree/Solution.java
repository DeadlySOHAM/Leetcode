package MaximumWidthOfBinaryTree;

public class Solution {

   public int diameterOfBinaryTree(TreeNode root) {
      if(root == null) return 0;
      int left[] = depth(root.left), right[] = depth(root.right);
      int leftMax = 1+Math.max(left[0],left[1]), rightMax = 1+Math.max(right[0],right[1]);
      int currentDepth = leftMax+rightMax;
      return Math.max(currentDepth,Math.max(left[2],right[2]));
   }

   private int[] depth(TreeNode root) {
      if(root == null) return new int[]{-1,-1,-1};
      int left[] = depth(root.left), right[] = depth(root.right);
      int leftMax = 1+Math.max(left[0],left[1]), rightMax = 1+Math.max(right[0],right[1]);
      int currentDepth = leftMax+rightMax;
      int result[] = new int[] {
         leftMax,
         rightMax,
         Math.max(currentDepth,Math.max(left[2],right[2]))
      };
      return result;
   }
}
