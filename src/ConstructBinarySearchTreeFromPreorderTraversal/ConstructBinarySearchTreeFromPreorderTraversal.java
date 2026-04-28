package ConstructBinarySearchTreeFromPreorderTraversal;

import java.util.Queue;
import java.util.LinkedList;

// 1008. Construct Binary Search Tree from Preorder Traversal

public class ConstructBinarySearchTreeFromPreorderTraversal {
   public static void main(String[] args) {
      Solution s = new Solution();
      println(s.bstFromPreorder(new int[]{8,5,1,7,10,12}));
      println(s.bstFromPreorder(new int[]{1,3}));
      println(s.bstFromPreorder(new int[]{3,1,2}));
      println(s.bstFromPreorder(new int[]{15,13,12,18}));
   }

   private static void println(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.offer(root);
      TreeNode layerEnd = root;
      while(!queue.isEmpty()) {
         root = queue.poll();
         System.out.print(root==null?"null":root.val);
         if(root==layerEnd) {
            System.out.println();
            layerEnd = (root!=null && root.right==null)?root.left:
               (root == null ? null : root.right);
         } else {
            System.out.print(",");
         }
         if(root==null) continue;
         queue.offer(root.left);
         queue.offer(root.right);
      }
   }
}