package SortList;

public class Solution2 {

   public ListNode sortList(ListNode head) {
      if(head == null || head.next == null) return head;
      else {
         ListNode headCopy = head;
         ListNode fast = head, prev = null;
         while(fast!=null && fast.next!=null) {
            prev = head;
            head = head.next;
            fast = fast.next.next;
         }
         prev.next = null;
         return merge(sortList(headCopy),sortList(head));
      }
   }

   private ListNode merge(ListNode a, ListNode b) {
      ListNode result = new ListNode(-1), resultHead = result;
      while(a!=null && b!=null) {
         if(a.val<=b.val) {
            result.next = a;
            a = a.next;
         } else if(a.val>b.val) {
            result.next = b;
            b = b.next;
         }
         result = result.next;
      }
      result.next = a==null?b:a;
      return resultHead.next;
   }
}
