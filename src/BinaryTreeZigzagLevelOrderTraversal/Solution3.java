package BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class Solution3 {

   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root==null) return result;
      if(root.left == null && root.right==null) {
         result.add(Arrays.asList(root.val));
         return result;
      }
      
      boolean level = false;
      Deque<TreeNode> q = new LinkedList<TreeNode>();
      q.offer(root);
      while(!q.isEmpty()) {
         ArrayList<Integer> res = new ArrayList<Integer>();
         TreeNode last = q.peekLast();
         do {
            TreeNode curr = q.pollFirst();
            if(curr.left!=null) q.offerLast(curr.left);
            if(curr.right!=null) q.offerLast(curr.right);
            if(level) res.add(0,curr.val);
            else res.add(curr.val);
            root = curr;
         } while(!q.isEmpty() && root != last);
         result.add(res);
         level=!level;
      }
      return result;
   }
}
