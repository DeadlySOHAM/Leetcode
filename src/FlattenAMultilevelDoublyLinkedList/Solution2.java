package FlattenAMultilevelDoublyLinkedList;

public class Solution2 {

   public Node flatten(Node head) {
      flattenTail(head);
      return head;
   }

   private Node flattenTail(Node head) {
      if(head==null) return head;
      else if(head.child != null) {
         Node flattenTail = flattenTail(head.child);
         flattenTail.next = head.next;
         if(head.next!=null)
            head.next.prev = flattenTail;
         head.next = head.child;
         head.child.prev = head;
         head.child = null;
         return flattenTail(head.next);
      } else if(head.next!=null) {
         return flattenTail(head.next);
      } else return head;
   }

}
