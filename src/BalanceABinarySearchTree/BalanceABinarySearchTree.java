package BalanceABinarySearchTree;

import java.util.*;

// 1382. Balance a Binary Search Tree

class BalanceABinarySearchTree {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.balanceBST(arrayAsTree(new Integer[] { 1,null,2,null,3,null,4,null,null })));
      System.out.println(s.balanceBST(arrayAsTree(new Integer[] {2,1,3})));
   }

   private static TreeNode arrayAsTree(Integer[] arr) {

      if (arr.length == 0 || arr[0] == null)
         return null;

      TreeNode root = new TreeNode(arr[0]);
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);

      int i = 1;

      while (!q.isEmpty() && i < arr.length) {

         TreeNode curr = q.poll();

         if (i < arr.length && arr[i] != null) {
            curr.left = new TreeNode(arr[i]);
            q.add(curr.left);
         }
         i++;

         if (i < arr.length && arr[i] != null) {
            curr.right = new TreeNode(arr[i]);
            q.add(curr.right);
         }
         i++;
      }

      return root;
   }
}