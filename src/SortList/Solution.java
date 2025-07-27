package SortList;

public class Solution {

   public ListNode sortList(ListNode head) {
      if(head == null || head.next == null) return head;
      else {
         int size = 0;
         ListNode headCopy = head;
         while(head!=null) {
            ++size;
            head = head.next;
         }
         int halfSize = size>>1;
         head = headCopy;
         while(--size>halfSize) head = head.next;
         ListNode headA = headCopy;
         ListNode headB = head.next;
         head.next = null;
         return merge(sortList(headA),sortList(headB));
      }
   }

   private ListNode merge(ListNode a, ListNode b) {
      ListNode result = null, resultHead = result;
      while(a!=null && b!=null) {
         if(a.val<=b.val) {
            if(result == null) {
               result = a;
               resultHead = result;
            }
            else if(result!=a) {
               result.next = a;
               result = result.next;
            }
            a = a.next;
         } else if(a.val>b.val) {
            if(result == null) {
               result = b;
               resultHead = result;
            }
            else if(result!=b) {
               result.next = b;
               result = result.next;
            }
            b = b.next;
         }
      }
      if(a==null) { if(result == null) return b; else  result.next = b; }
      else if(b==null) { if(result == null) return a; else  result.next = a; }
      return resultHead;
   }
}
