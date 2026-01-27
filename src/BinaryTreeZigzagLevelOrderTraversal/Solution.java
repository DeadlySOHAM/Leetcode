package BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class Solution {
   
   private static class Pair<X,Y> {
      final X first;
      final Y second;
      public Pair(X first, Y second) {
         this.first = first;
         this.second = second;
      }
      public String toString() {
         return "{first-"+this.first+",second-"+this.second+"}";
      }
   }
   
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if (root == null)
         return result;
      if(root.left == null && root.right==null) {
         result.add(Arrays.asList(root.val));
         return result;
      }
      
      int level = 1;
      Deque<Pair<TreeNode,Integer>> dq = new LinkedList<Pair<TreeNode,Integer>>();
      dq.addFirst(new Pair<TreeNode,Integer>(root,1));
      while(!dq.isEmpty()) {
         if((level & 1)==0) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            do {
               Pair<TreeNode,Integer> curr = dq.pollFirst();
               System.out.println(curr);
               res.add(curr.first.val);
               if(curr.first.right!=null) dq.offerLast(new Pair<TreeNode,Integer>(curr.first.right,curr.second+1));
               if(curr.first.left!=null) dq.offerLast(new Pair<TreeNode,Integer>(curr.first.left,curr.second+1));
            } while(!dq.isEmpty() && dq.peekFirst().second == level);
            level = dq.peekFirst()!=null ? dq.peekFirst().second : -1;
            result.add(res);
         } else {
            ArrayList<Integer> res = new ArrayList<Integer>();
            do {
               Pair<TreeNode,Integer> curr = dq.pollLast();
               res.add(curr.first.val);
               if(curr.first.left!=null) dq.offerFirst(new Pair<TreeNode,Integer>(curr.first.left,curr.second+1));
               if(curr.first.right!=null) dq.offerFirst(new Pair<TreeNode,Integer>(curr.first.right,curr.second+1));
            } while(!dq.isEmpty() && dq.peekLast().second == level);
            level = dq.peekLast()!=null ? dq.peekLast().second : -1;
            result.add(res);
         }
      }
      return result;
   }
}
