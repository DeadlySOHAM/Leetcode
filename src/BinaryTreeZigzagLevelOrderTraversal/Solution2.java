package BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class Solution2 {

   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root==null) return result;
      if(root.left == null && root.right==null) {
         result.add(Arrays.asList(root.val));
         return result;
      }
      
      boolean level = false;
      Deque<TreeNode> dq = new LinkedList<TreeNode>();
      dq.addFirst(root);
      while(!dq.isEmpty()) {
         ArrayList<Integer> res = new ArrayList<Integer>();
         if(level) {
            TreeNode last = dq.peekLast();
            do {
               TreeNode curr = dq.pollFirst();
               res.add(curr.val);
               if(curr.right!=null) dq.offerLast(curr.right);
               if(curr.left!=null) dq.offerLast(curr.left);
               root = curr;
            } while(!dq.isEmpty() && root != last);
            root = dq.peekLast();
         } else {
            TreeNode last = dq.peekFirst();
            do {
               TreeNode curr = dq.pollLast();
               res.add(curr.val);
               if(curr.left!=null) dq.offerFirst(curr.left);
               if(curr.right!=null) dq.offerFirst(curr.right);
               root = curr;
            } while(!dq.isEmpty() && root != last);
            root = dq.peekFirst();
         }
         result.add(res);
         level=!level;
      }
      return result;
   }
}
