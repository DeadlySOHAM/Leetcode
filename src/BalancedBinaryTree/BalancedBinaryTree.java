package BalancedBinaryTree;

// 110. Balanced Binary Tree

public class BalancedBinaryTree {

   public static void main(String[] args) {
      // Solution s = new Solution();
      Solution2 s = new Solution2();
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 2, 3, 3, null, null, 4, 4 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 2, 3, null, null, 3, 4, null, null, 4 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 3, 4, 5, 6, 7 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, null, 3, null, 4, null, 5 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 7, 9, 7, 8, 8, 6, null, 10, 9 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 3, null, 5, null, 4 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 3, 4, null, null, null, 5 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, null, 3 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 3 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 2, 3, 5 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 3, 2, 5, 3, null, 9 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 3, 2, null, null, null, 4, 6, 5 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1, 3, 2, 5, null, null, 9, 6, null, 7 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] { 1 })));
      System.out.println(s.isBalanced(arrayAsTree(new Integer[] {})));
   }

   private static TreeNode arrayAsTree(Integer[] arr) {
      TreeNode[] temp = new TreeNode[arr.length];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == null)
            continue;
         else if (temp[i] == null)
            temp[i] = new TreeNode(arr[i]);
         int left = (i << 1) + 1;
         int right = (i << 1) + 2;
         if (left < arr.length) {
            temp[left] = arr[left] != null ? new TreeNode(arr[left]) : null;
            temp[i].left = temp[left];
         }
         if (right < arr.length) {
            temp[right] = arr[right] != null ? new TreeNode(arr[right]) : null;
            temp[i].right = temp[right];
         }
      }
      return arr.length < 1 ? null : temp[0];
   }
}
