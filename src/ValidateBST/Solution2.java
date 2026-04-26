package ValidateBST;

class Solution2 {
  private Integer max = null;
  public boolean isValidBST(TreeNode root) {
    if (root == null)  return true;
    boolean val = isValidBST(root.left);
    if(!val) return false;
    if (this.max != null && root.val <= this.max)    return false;
    this.max = root.val;
    return isValidBST(root.right);
  }
}