package DeleteNodeInABST;

class Solution {
  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null)
      return null;
    if (root.left == null && root.right == null && root.val == key)
      return null;
    TreeNode prev = null;
    TreeNode rootCopy = root;
    while (root != null && root.val != key) {
      prev = root;
      if (key > root.val)
        root = root.right;
      else
        root = root.left;
    }
    if (root == null) {
      return rootCopy;
    } else if(prev==null) {
      if(root.left==null && root.right==null) return null;
      else if(root.right==null) {
        return root.left;
      } else {
        TreeNode toBeDeletedNode = root;
        root=root.right;
        if (root.left == null) {
          TreeNode replacingNode = root;
          replacingNode.left = toBeDeletedNode.left;
          return replacingNode;
        } else {
          while (root.left.left != null)
            root = root.left;
          TreeNode replacingNode = root.left;
          root.left = replacingNode.right;
          replacingNode.left = toBeDeletedNode.left;
          replacingNode.right = toBeDeletedNode.right;
          return replacingNode;
        }
      }
    }
    
    boolean isLeft = prev.left == root;
    TreeNode toBeDeletedNode = root;
    if (root.right == null && root.left == null) {
      if (isLeft)
        prev.left = null;
      else
        prev.right = null;
      return rootCopy;
    } else if(root.right==null || root.left==null) {
      if(isLeft) prev.left=root.left == null?root.right:root.left;
      else prev.right = root.left == null?root.right:root.left;
      return rootCopy;
    } else {
      root = root.right;
      if (root.left == null) {
        TreeNode replacingNode = root;
        if (isLeft)
          prev.left = replacingNode;
        else
          prev.right = replacingNode;
        replacingNode.left = toBeDeletedNode.left;
        return rootCopy;
      } else {
        while (root.left.left != null)
          root = root.left;
        TreeNode replacingNode = root.left;
        if (isLeft)
          prev.left = replacingNode;
        else
          prev.right = replacingNode;
        root.left = replacingNode.right;
        replacingNode.left = toBeDeletedNode.left;
        replacingNode.right = toBeDeletedNode.right;
        return rootCopy;
      }
    }
  }
}