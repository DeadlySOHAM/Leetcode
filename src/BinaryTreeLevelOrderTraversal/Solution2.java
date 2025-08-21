package BinaryTreeLevelOrderTraversal;

import java.util.*;

// BFS Oriented

class Solution2 {

   public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root == null) return result;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      while(!queue.isEmpty()) {
         int nodeCount = queue.size();
         List<Integer> level = new ArrayList<Integer>(queue.size());
         while(nodeCount-->0) {
            TreeNode node = queue.poll();
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
            level.add(node.val);
         }
         if(!level.isEmpty()) result.add(level);
      }
      return result;
   }
}