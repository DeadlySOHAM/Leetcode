package PopulatingNextRightPointersInEachNode;

public class Solution3 {
   public Node connect(Node root) {
      if(root==null) return null;
      Node rootCopy = root;
      while(root.left!=null) {
         Node curr = root;
         while(curr!=null) {
            curr.left.next = curr.right;
            if(curr.next!=null) curr.right.next = curr.next.left;
            curr = curr.next;
         }
         root = root.left;
      }
      return rootCopy;
   }
}