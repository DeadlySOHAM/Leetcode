package LowestCommonAncestorOfBinaryTree;

public class Solution {

    int height=Integer.MIN_VALUE;
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      this.height = Integer.MIN_VALUE;
      this.ans = null;
      int returnVal = lowestCommonAncestor(root,0,p,q);
      System.out.println(returnVal+","+this.height);
      if(returnVal>1 && this.height==Integer.MIN_VALUE) return root;
      else return ans;
    }

    private int lowestCommonAncestor(TreeNode root, int height, TreeNode p, TreeNode q) {
      if(root==null) return -1;
      int left = lowestCommonAncestor(root.left,height+1,p,q);
      int right = lowestCommonAncestor(root.right,height+1,p,q);
      int returnVal = -1;
      if(root==p) {
        returnVal = 0;
        if(left==1 || right==1)
          if(height>this.height) {
            this.height = height;
            this.ans = root;
            returnVal = 3;
          }
      } else if(root==q) {
        returnVal = 1;
        if(left==0 || right==0)
          if(height>this.height) {
            this.height = height;
            this.ans = root;
            returnVal = 3;
          }
      } else if(left>-1 && right>-1) {
          returnVal = 3;
          if(height>this.height) {
            this.height = height;
            this.ans = root;
          }
      }
      return Math.max(Math.max(left,right),returnVal);
    }
}
