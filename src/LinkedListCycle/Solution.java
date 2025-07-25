package LinkedListCycle;

public class Solution {
   public boolean hasCycle(ListNode head) {
      if(head == null) return false;
      ListNode rabit = head.next;
      while(head!=null && rabit!=null) {
         if(head==rabit) return true;
         head = head.next;
         rabit = rabit.next;
         if(rabit!=null) rabit = rabit.next;
         else return false;
      }
      return false;
   }
}