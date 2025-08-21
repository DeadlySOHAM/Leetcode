package BinaryTreeLevelOrderTraversal;

import java.util.*;

// DFS Oriented

class Solution {

   public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      levelOrder(root,0,result);
      return result;
   }

   private void levelOrder(TreeNode root, int depth, List<List<Integer>> result) {
      if(root==null) return;
      while(result.size()<depth+1) result.add(new ArrayList<Integer>());
      result.get(depth).add(root.val);
      if(root.left!=null) levelOrder(root.left,depth+1,result);
      if(root.right!=null) levelOrder(root.right,depth+1,result);
   }
}