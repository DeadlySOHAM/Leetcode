package ConstructBinaryTreeFromPreorderAndInorderTraversal;

// 105 : Construct Binary Tree from Preorder and Inorder Traversal

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
   public static void main(String[] args) {
      Solution2 s = new Solution2();
      System.out.println(s.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
      System.out.println(s.buildTree(new int[]{0, 1, 3, 4, 2, 5},new int[]{3, 1, 4, 0, 5, 2}));
      System.out.println(s.buildTree(new int[]{1, 2, 4, 5, 3},new int[]{5, 4, 2, 1, 3}));
      System.out.println(s.buildTree(new int[]{1, 4, 5, 2, 3},new int[]{2, 5, 4, 1, 3}));
      System.out.println(s.buildTree(new int[]{-1}, new int[]{-1}));
      System.out.println(s.buildTree(new int[]{}, new int[]{}));
   }
}