package PalindromeLinkedList;

class Solution {
   public boolean isPalindrome(ListNode head) {
      if (head.next == null)
         return true;
      ListNode headCopy = head, fast = head;
      while (fast != null && fast.next != null) {
         head = head.next;
         fast = fast.next.next;
      }

      ListNode firstPointer = headCopy, secondPointer;
      if(fast == null) secondPointer = reverse(head);
      else secondPointer = reverse(head.next);
      while (firstPointer != head) {
         if (firstPointer.val != secondPointer.val)
            return false;
         firstPointer = firstPointer.next;
         secondPointer = secondPointer.next;
      }
      return true;
   }

   private ListNode reverse(ListNode head) {
      ListNode previous = null;
      while(head!=null) {
         ListNode temp = head.next;
         head.next = previous;
         previous = head;
         head = temp;
      }
      return previous;
   }
}