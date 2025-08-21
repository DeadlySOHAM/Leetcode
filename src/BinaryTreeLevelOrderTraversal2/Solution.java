package BinaryTreeLevelOrderTraversal2;

import java.util.*;

class Solution {

   public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if (root == null)
         return result;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      while (!queue.isEmpty()) {
         int nodeCount = queue.size();
         List<Integer> level = new ArrayList<Integer>(queue.size());
         while (nodeCount-- > 0) {
            TreeNode node = queue.poll();
            if (node.left != null)
               queue.add(node.left);
            if (node.right != null)
               queue.add(node.right);
            level.add(node.val);
         }
         if (!level.isEmpty())
            result.addFirst(level);
      }
      return result;
   }
}