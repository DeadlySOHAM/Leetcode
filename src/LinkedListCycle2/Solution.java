package LinkedListCycle2;

public class Solution {
   public ListNode detectCycle(ListNode head) {
      if(head == null) return null;
      ListNode headCopy = head, rabit = head;
      while(head!=null && rabit!=null) {
         head = head.next;
         rabit = rabit.next;
         if(rabit!=null) rabit = rabit.next;
         else return null;
         if(head==rabit) {
            head = headCopy;
            while(head!=rabit) {
               rabit = rabit.next;
               head = head.next;
            }
            return head;
         }
      }
      return null;
   }
}
