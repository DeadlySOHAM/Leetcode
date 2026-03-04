package ConstructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.HashMap;

class Solution2 {

   public TreeNode buildTree(int[] preorder, int[] inorder) {

      HashMap<Integer,Integer> inOrderRecord = new HashMap<Integer,Integer>(inorder.length);

      for(int i=0;i<inorder.length;i++)
         inOrderRecord.put(inorder[i],i);

      return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length, inOrderRecord);
   }

   private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer,Integer> inOrderRecord) {
      
      if(preStart>=preEnd) return null;
      if(preStart-preEnd == 1) return new TreeNode(preorder[preStart]);

      int index = inOrderRecord.get(preorder[preStart]);
      int sizeOfLeft = index-inStart;

      TreeNode root = new TreeNode(preorder[preStart]);
      
      ++preStart;
      int preStart2 = preStart+sizeOfLeft;

      root.left = buildTree(preorder, preStart, preStart2, inorder, inStart, index, inOrderRecord);
      root.right = buildTree(preorder, preStart2, preEnd, inorder, ++index, inEnd, inOrderRecord);
      return root;
   }

}