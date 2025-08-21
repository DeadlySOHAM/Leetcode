package BinaryTreeLevelOrderTraversal2;

import java.util.*;

// 107

class BinaryTreeLevelOrderTraversal2 {

   public static void main(String[] args) {
      Solution s = new Solution();
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{1,2,3})));
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{10,20,30,40,50})));
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{3,9,20,null,null,15,7})));
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{1, 3, 2, null, null, null, 4, 6, 5})));
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{1})));
      print(s.levelOrderBottom(arrayAsTree(new Integer[]{})));
   }

   private static TreeNode arrayAsTree(Integer[] arr) {
      TreeNode[] temp = new TreeNode[arr.length];
      for(int i=0;i<arr.length;i++) {
         if(arr[i]==null) continue;
         else if(temp[i] == null) temp[i] = new TreeNode(arr[i]);
         int left = (i<<1)+1;
         int right = (i<<1)+2;
         if(left < arr.length ) {
            temp[left] = arr[left] != null ? new TreeNode(arr[left]) : null;
            temp[i].left = temp[left];
         }
         if(right < arr.length ) {
            temp[right] = arr[right]!=null ? new TreeNode(arr[right]) : null;
            temp[i].right = temp[right];
         }
      }
      return arr.length<1?null:temp[0];
   }

   private static void print(List<List<Integer>> arr) {
      System.out.print("[");
      for(List<Integer> e : arr)
         System.out.print(e+ " ");
      System.out.println("]");
   }
}