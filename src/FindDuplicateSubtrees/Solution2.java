package FindDuplicateSubtrees;
import java.util.*;


public class Solution2 {

   private int id = 1;
   HashMap<String,Integer> ids;
   HashMap<String,Boolean> record;
   List<TreeNode> result;
   
   public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
      result = new ArrayList<TreeNode>();
      if(root==null|| (root.left==null && root.right==null)) return result;
      ids = new HashMap<String,Integer>();
      record = new HashMap<String,Boolean>();
      findDuplicateSubtrees2(root);
      return result;
   }

   private int findDuplicateSubtrees2(TreeNode a) {
      if(a==null) return 0;
      int left = findDuplicateSubtrees2(a.left);
      int right = findDuplicateSubtrees2(a.right);
      String root = a.val+" "+left+" "+right;
      if(!ids.containsKey(root)) 
         ids.put(root,id++);
      int root_id = ids.get(root);
      if(record.containsKey(root)) {
         if(record.get(root)) return root_id;
         record.put(root,Boolean.TRUE);
         result.add(a);
      } else record.put(root,Boolean.FALSE);
      return root_id;
   }

}
