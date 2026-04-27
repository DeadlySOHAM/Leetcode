package PopulatingNextRightPointersInEachNode;

import java.util.*;

public class Solution {
   public Node connect(Node root) {
      if(root==null) return null;
      if(root.left==null && root.right == null) return root;
      Node rootCopy = root;
      Stack<Node> stack = new Stack<Node>();
      Queue<Node> queue = new LinkedList<Node>();
      stack.push(root);
      queue.offer(root);
      while(!queue.isEmpty()) {
         root = queue.poll();
         if(root==stack.peek()) {
            root.next = null;
            stack.pop();
            if(root.right!=null) stack.push(root.right);
            else stack.push(root.left);
         } else {
            root.next = queue.peek();
         }
         if(root.left!=null) queue.offer(root.left);
         if(root.right!=null) queue.offer(root.right);
      }
      return rootCopy;
   }
}