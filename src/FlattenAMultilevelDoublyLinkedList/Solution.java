package FlattenAMultilevelDoublyLinkedList;

public class Solution {

   public Node flatten(Node head) {
      if(head==null) return head;
      Node tail = head;
      while(tail!=null && tail.child==null) tail=tail.next;
      if(tail == null) return head;
      Node flatenChild = flatten(tail.child);
      if(flatenChild!=null) {
         Node tempNext = tail.next;
         tail.next = flatenChild;
         flatenChild.prev = tail;
         tail.child = null;
         while(flatenChild.next!=null) flatenChild = flatenChild.next;
         flatenChild.next = tempNext;
         if(tempNext!=null)
            tempNext.prev = flatenChild;
      }
      return head;
   }
}
