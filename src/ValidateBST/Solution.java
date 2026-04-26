package ValidateBST;

import java.util.*;

class Solution {
    public boolean isValidBST(TreeNode root) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      getInOrder(root,arr);
      Integer max = null;
      for(int i=0;i<arr.size();i++)
          if(max==null || arr.get(i)>max) max = arr.get(i);
          else return false;
      return true;
    }
    private void getInOrder(TreeNode root, ArrayList<Integer> arr) {
      if(root==null) return;
      getInOrder(root.left,arr);
      arr.add(root.val);
      getInOrder(root.right,arr);
    }
}