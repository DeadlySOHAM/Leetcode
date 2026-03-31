package PathSum3;

import java.util.*;

// 437. Path Sum III

public class PathSum3 {

   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 10,5,-3,3,2,null,11,3,-2,null,1 }),8)==3?"true":("false:"+3));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 5,4,8,11,null,13,4,7,2,null,null,5,1 }),22)==3?"true":("false:"+3));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 1 }),1)==1?"true":("false:"+1));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 1 }),0)==0?"true":("false:"+0));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 0,1,1 }),1)==4?"true":("false:"+4));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 1,2 }),2)==1?"true":("false:"+1));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 1,-2,-3,1,3,-2,null,-1 }),3)==1?"true":("false:"+1));
      System.out.println(s.pathSum(arrayAsTree(new Integer[] { 1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000 }),0)==0?"true":("false:"+0));
   }

   private static TreeNode arrayAsTree(Integer[] arr) {

      if (arr.length == 0 || arr[0] == null)
         return null;

      TreeNode root = new TreeNode(arr[0]);
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);

      int i = 1;

      while (!q.isEmpty() && i < arr.length) {

         TreeNode curr = q.poll();

         if (i < arr.length && arr[i] != null) {
            curr.left = new TreeNode(arr[i]);
            q.add(curr.left);
         }
         i++;

         if (i < arr.length && arr[i] != null) {
            curr.right = new TreeNode(arr[i]);
            q.add(curr.right);
         }
         i++;
      }

      return root;
   }

}
