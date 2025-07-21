package ReverseLinkedList;

import java.util.*;

public class Solution {

   public ListNode reverseList(ListNode head) {
      // return this.recurse(head, null);

      // using stack 
      /* 
      if (head == null)
         return null;
      Stack<ListNode> stack = new Stack<ListNode>();
      while (head != null) {
         stack.push(head);
         head = head.next;
      }
      head = stack.pop();
      ListNode headReturn = head;
      while (!stack.isEmpty()) {
         head.next = stack.pop();
         head = head.next;
         head.next = null;
      }
      return headReturn;
      */

      // without using stack
      ListNode previous = null;
      while(head!=null) {
         ListNode next = head.next;
         head.next = previous;
         previous = head;
         head = next;
      }
      return previous;
   }

   private ListNode recurse(ListNode current, ListNode previous) {
      if (current == null) {
         return null;
      }
      ListNode head = recurse(current.next, current);
      current.next = previous;
      return head == null ? current : head;
   }
}
