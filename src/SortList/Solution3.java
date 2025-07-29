package SortList;

public class Solution3 {

   public ListNode sortList(ListNode head) {
      if(head == null || head.next == null) return head;
      else {
         int pivot = head.val;
         ListNode left = new ListNode(Integer.MIN_VALUE);
         ListNode middle = new ListNode(Integer.MIN_VALUE);
         ListNode right = new ListNode(Integer.MIN_VALUE);
         ListNode leftStart = left, rightStart = right, middleStart = middle;
         while(head!=null) {
            if(head.val<pivot) {
               left.next = head;
               left = left.next;
            } else if(head.val>pivot) {
               right.next = head;
               right = right.next;
            } else {
               middle.next = head;
               middle = middle.next;
            }
            head = head.next;
         }
         left.next = null;
         right.next = null;
         left = sortList(leftStart.next);
         right = sortList(rightStart.next);
         leftStart = left;
         middle.next = right;
         if(left!=null) {
            while(left.next!=null) left = left.next; // extra overhead
            left.next = middleStart.next;
            return leftStart;
         } else return middleStart;
      }
   }
}
