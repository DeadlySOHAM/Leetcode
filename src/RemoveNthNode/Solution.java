package RemoveNthNode;

import RemoveNthNode.RemoveNthNodeFromLast.ListNode;
import java.util.Stack;

class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp = head;
      Stack<ListNode> stack = new Stack<ListNode>();
      while(temp!=null){
         stack.push(temp);
         temp = temp.next;
      }

      while(!stack.isEmpty() && n-->0)
         temp = stack.pop();
      if(!stack.isEmpty())
         stack.pop().next = temp.next;
      else
         head = head.next;

      return head;
   }
}
