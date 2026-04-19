package KthAncestorOfATreeNode;

// 1483. Kth Ancestor of a Tree Node

class KthAncestorOfATreeNode {
   public static void main(String[] args) {
      TreeAncestor treeAncestor = new TreeAncestor(7, new int[] {-1, 0, 0, 1, 1, 2, 2});
      System.out.println(treeAncestor.getKthAncestor(3, 1)==1);
      System.out.println(treeAncestor.getKthAncestor(5, 2)==0);
      System.out.println(treeAncestor.getKthAncestor(6, 3)==-1);
   }
}