package DeleteNodeInABST;

// 450. Delete Node in a BST

class DeleteNodeInABST {
   
   public static void main(String[] args) {
      // Solution s = new Solution();
      Solution s = new Solution();
      System.out.println(s.deleteNode(arrayAsTree(new Integer[] { 5,3,6,2,4,null,7 }),5));
      System.out.println(s.deleteNode(arrayAsTree(new Integer[] { 2,1 }),2));
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