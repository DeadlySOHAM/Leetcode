package FindDuplicateSubtrees;

import java.util.*;

public class Solution {

   public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
      List<TreeNode> result = new ArrayList<TreeNode>();
      if(root==null|| (root.left==null && root.right==null)) return result;
      findDuplicateSubtrees(root,result,new HashMap<String,Boolean>());
      return result;
   }

   private StringBuilder findDuplicateSubtrees(TreeNode a, List<TreeNode> result, HashMap<String,Boolean> record) {
      if(a==null) return new StringBuilder("null");
      StringBuilder left = findDuplicateSubtrees(a.left, result, record);
      StringBuilder right = findDuplicateSubtrees(a.right, result, record);
      StringBuilder root = new StringBuilder(Integer.toString(a.val));
      root = root.append(" ").append(left).append(" ").append(right);
      String root_s = root.toString();
      if(record.containsKey(root_s)) {
         if(record.get(root_s)) return root;
         record.put(root_s,Boolean.TRUE);
         result.add(a);
      } else record.put(root_s,Boolean.FALSE);
      return root;
   }
}
