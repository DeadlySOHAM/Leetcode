package BalancedBinaryTree;

public class Solution2 {

   public boolean isBalanced(TreeNode root) {
      return getHeightDiff(root) > -1;
   }

   private int getHeightDiff(TreeNode root) {
      if(root==null) return 0;
      int left = getHeightDiff(root.left);
      int right = getHeightDiff(root.right);
      return (left<0 || right<0) ? -1 : 
                Math.abs(left-right)>1 ? -1 :
                  Math.max(left,right)+1;
   }
}
