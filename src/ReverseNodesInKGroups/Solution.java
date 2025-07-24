package ReverseNodesInKGroups;

import java.util.*;

class Solution {
   
   public ListNode reverseKGroup2(ListNode head, int k) {
      if (head == null || head.next == null)
         return head;
      Stack<ListNode> stack = new Stack<ListNode>();
      ListNode headReturn = null, node = null;
      int counter = 0;
      while (head != null) {
         stack.push(head);
         ++counter;
         if (counter == k && !stack.isEmpty()) {
            ListNode nextHead = head.next;
            if (node == null) {
               node = stack.pop();
               headReturn = node;
            } else {
               node.next = stack.pop();
               node = node.next;
            }
            node.next = nextHead;
            while (!stack.isEmpty()) {
               ListNode tempNext = stack.pop();
               tempNext.next = nextHead;
               node.next = tempNext;
               node = tempNext;
            }
            counter = 0;
            head = nextHead;
         } else
         head = head.next;
      }
      return headReturn;
   }
   
   public ListNode reverseKGroup(ListNode head, int k) {
      if (head == null || head.next == null)
         return head;
      ListNode headReturn = null, headOfNextGroup = head, tailOfLastGroup = null;
      int counter = 0;
      while (head != null) {
         counter++;
         if(counter == k) {
            ListNode restOfList = head.next;
            head.next = null;
            ListNode[] headTailOfThisGroup = reverse(headOfNextGroup);
            if(headReturn == null) {
               headReturn = headTailOfThisGroup[0];
               tailOfLastGroup = headTailOfThisGroup[1];
            } else {
               tailOfLastGroup.next = headTailOfThisGroup[0];
               tailOfLastGroup = headTailOfThisGroup[1];
            }
            head = restOfList;
            headOfNextGroup = head;
            tailOfLastGroup.next = restOfList;
            counter = 0;
         } else
         head = head.next;
      }
      return headReturn;
   }

   public ListNode[] reverse(ListNode head) {
      ListNode previous = null, headCopy = head;
      while(head!=null) {
         ListNode next = head.next;
         head.next = previous;
         previous = head;
         head = next;
      }
      return new ListNode[]{previous,headCopy};
   }
}