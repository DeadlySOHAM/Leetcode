package BalancedBinaryTree;

public class Solution {

   public boolean isBalanced(TreeNode root) {
      if(root==null) return true;
      int[] left = getHeightDiff(root.left);
      int[] right = getHeightDiff(root.right);
      return left[1]==1 && right[1]==1 && Math.abs(left[0]-right[0])<=1;
   }

   private int[] getHeightDiff(TreeNode root) {
      if(root==null) return new int[]{0,1};
      int[] left = getHeightDiff(root.left);
      int[] right = getHeightDiff(root.right);
      int diff = left[0]-right[0];
      left[0] = Math.max(left[0],right[0])+1;
      left[1] = left[1]==1 && right[1]==1 && Math.abs(diff)<=1 ? 1 : 0;
      return left;
   }
}
