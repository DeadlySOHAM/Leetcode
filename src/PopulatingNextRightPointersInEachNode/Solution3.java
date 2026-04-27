package PopulatingNextRightPointersInEachNode;

public class Solution3 {
   public Node connect(Node root) {
      if(root==null) return null;
      if(root.left==null && root.right == null) return root;
      Node rootCopy = root;
      while(root.left!=null) {
         Node curr = root;
         while(curr!=null) {
            if(curr.left!=null) curr.left.next = curr.right;
            if(curr.next!=null) curr.right.next = curr.next.left;
            curr = curr.next;
         }
         if(root.next!=null && root.right!=null) root.right.next = root.next.left;
         root = root.left;
      }
      return rootCopy;
   }
}