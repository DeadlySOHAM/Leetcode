package SwapNodesInPair;

import SwapNodesInPair.SwapNodesInPair.ListNode;

public class Solution {
   public ListNode swapPairs(ListNode head) {
      ListNode headCopy = head, result = null;
      while(headCopy!=null && headCopy.next!=null) {
         if(result==null) {
            ListNode next = headCopy.next;
            headCopy.next = next.next;
            next.next = headCopy;
            result = next;
         } else {
            ListNode previous = headCopy, current = headCopy.next, next = current.next;
            if(next!=null && current!=null){
               previous.next = next;
               ListNode tempNext = next.next;
               next.next = current;
               current.next = tempNext;
               headCopy = current;
            } else {
               break;
            }
         }
      }
      return result==null?head:result;
   }
}
