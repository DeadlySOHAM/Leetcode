package PathSum3;
import java.util.*;


public class Solution {

   public int pathSum(TreeNode root, int targetSum) {
      this.count=0;
      pathSum(root, new HashMap<Long,Integer>(), 0L, 0, targetSum);
      System.out.println(this.count);
      return count;
   }

   private int count = 0;
   private void pathSum(TreeNode root, HashMap<Long,Integer> record, long lastSum, int index, int targetSum) {
      if(root==null) return;
      long nextSum = lastSum+root.val;
      System.out.println(lastSum+":"+nextSum+"="+record);
      if(nextSum==targetSum)++this.count;
      this.count+= record.getOrDefault(nextSum-targetSum,0);
      record.put(nextSum,record.getOrDefault(nextSum,0)+1);
      if(root.left!=null) pathSum(root.left, record, nextSum, index+1, targetSum); 
      if(root.right!=null) pathSum(root.right, record, nextSum, index+1, targetSum);
      if(record.get(nextSum)>1) record.put(nextSum, record.get(nextSum)-1);
      else record.remove(nextSum);
   }

}
