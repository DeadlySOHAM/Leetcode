package ValidateBST;

// 98. Validate Binary Search Tree

class ValidateBST {
   public static void main(String[] args) {
      // Solution s = new Solution();
      Solution2 s = new Solution2();
      System.out.println(s.isValidBST(arrayAsTree(new Integer[] { 5,1,4,null,null,3,6 }))==false);
      s = new Solution2();
      System.out.println(s.isValidBST(arrayAsTree(new Integer[] { 2,1,3 })));
      s = new Solution2();
      System.out.println(s.isValidBST(arrayAsTree(new Integer[] { 2,1,3,null,null,null,5 })));
      s = new Solution2();
      System.out.println(s.isValidBST(arrayAsTree(new Integer[] { -2147483648 })));
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