package RemoveDuplicatesFromSortedLinkedList;

public class Solution {
   public ListNode deleteDuplicates(ListNode head) {
      ListNode headCopy = head;
      while(head!=null) {
         ListNode current = head;
         head = head.next;
         while(head!=null && current.val == head.val) {
            head = head.next;
            current.next = head;
            if(head == null) return headCopy;
         }
      }
      return headCopy;
   }
}
