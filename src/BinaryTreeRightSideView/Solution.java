package BinaryTreeRightSideView;

import java.util.*;

class Solution {
   public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<Integer>();
      if(root==null) return result;
      result.add(root.val);
      if(root.left == null && root.right==null) return result;
      this.rightSideView(root,result,0);
      return result;
   }

   private void rightSideView(TreeNode root, List<Integer> result, int i) {
      if(root==null) return;
      if(result.size()<=i)
         result.add(root.val);
      rightSideView(root.right, result, i+1);
      rightSideView(root.left, result, i+1);
   }
}