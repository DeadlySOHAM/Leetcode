package ConstructBinarySearchTreeFromPreorderTraversal;

public class Solution {
   public TreeNode bstFromPreorder(int[] preorder) {
      if(preorder.length<=0) return null;
      TreeNode root = new TreeNode(preorder[0]);
      for(int i=1;i<preorder.length;i++) {
         TreeNode iterate = root;
         while(iterate!=null) {
            if(preorder[i]>iterate.val) {
               if(iterate.right==null) {
                  iterate.right = new TreeNode(preorder[i]);
                  break;
               } else iterate=iterate.right;
            } else {
               if(iterate.left==null) {
                  iterate.left = new TreeNode(preorder[i]);
                  break;
               } else iterate=iterate.left;
            }
         }
      }
      return root;
   }
}