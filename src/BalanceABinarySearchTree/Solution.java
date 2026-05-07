package BalanceABinarySearchTree;

import java.util.*;

class Solution {
   public TreeNode balanceBST(TreeNode root) {
      ArrayList<TreeNode> list = new ArrayList<TreeNode>();
      addInOrder(root, list);
      return createInOrder(list,0,list.size()-1);
   }

   private void addInOrder(TreeNode root, ArrayList<TreeNode> list) {
      if (root == null) return;
      addInOrder(root.left, list);
      root.left = null;
      list.add(root);
      addInOrder(root.right, list);
      root.right = null;
   }

   private TreeNode createInOrder(ArrayList<TreeNode> list,int start, int end ) {
      System.out.println(start+","+end);
      if(start>end) return null;
      int mid = start + (end-start) / 2;
      TreeNode root = list.get(mid);
      root.left = createInOrder(list, start, mid-1);
      System.out.println("----");
      root.right = createInOrder(list, mid+1, end);
      return root;
   }
}