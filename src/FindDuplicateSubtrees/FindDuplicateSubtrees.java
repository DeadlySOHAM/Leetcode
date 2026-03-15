package FindDuplicateSubtrees;

import java.util.*;

// 652. Find Duplicate Subtrees


public class FindDuplicateSubtrees {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 1, 2, 3, 4, null, 2, 4, null, null, 4 })));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 2, 1, 1 })));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 1 })));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 0, 0, 0, 0, null, null, 0, null, null, null, 0})));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 0,0,0,null,null,0})));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] { 2,1,11,11,null,1})));
      System.out.println(s.findDuplicateSubtrees(arrayAsTree(new Integer[] {})));
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