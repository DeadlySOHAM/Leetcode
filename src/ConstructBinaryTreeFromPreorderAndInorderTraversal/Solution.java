package ConstructBinaryTreeFromPreorderAndInorderTraversal;

class Solution {

   public TreeNode buildTree(int[] preorder, int[] inorder) {

      if(preorder.length==0 || inorder.length == 0) return null;
      if(preorder.length==1) return new TreeNode(preorder[0]);

      int index = find(inorder,preorder[0]);
      int left = 0, right = index+1, r =0, l=0;

      int[][] splitInOrder = {
         new int[index],
         new int[Math.max(inorder.length-right,0)]
      };
      while(left<index || right < inorder.length) {
         if(left<index) splitInOrder[0][left] = inorder[left++];
         if(right<inorder.length) splitInOrder[1][r++] = inorder[right++];
      }

      left = 1;
      right = index+1;

      int[][] splitPreOrder = {
         new int[index+1], new int[Math.max(preorder.length-right,0)]
      };
      r=0;
      l=0;
      while(left<=index || right < preorder.length) {
         if(left<=index) splitPreOrder[0][l++] = preorder[left++];
         if(right<preorder.length) splitPreOrder[1][r++] = preorder[right++];
      }

      TreeNode root = new TreeNode(preorder[0]);
      root.left = buildTree(splitPreOrder[0], splitInOrder[0]);
      root.right = buildTree(splitPreOrder[1], splitInOrder[1]);
      return root;
   }

   private int find(int[] arr, int key) {
      for(int i=0;i<arr.length; i++)
         if(arr[i]==key)
            return i;
      return -1;
   }
}