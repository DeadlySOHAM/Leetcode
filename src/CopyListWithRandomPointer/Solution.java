package CopyListWithRandomPointer;

class Solution {

   public Node copyRandomList2(Node head) {

      Node result = new Node(Integer.MIN_VALUE), resultHead = result, headCopy = head;

      while (head != null) {
         result.next = new Node(head.val);
         head = head.next;
         result = result.next;
      }

      result = resultHead.next;
      head = headCopy;

      while (head != null) {
         Node inputHead = headCopy, outputHead = resultHead.next;
         while (inputHead != null && inputHead != head.random) {
            inputHead = inputHead.next;
            outputHead = outputHead.next;
         }
         result.random = outputHead;
         head = head.next;
         result = result.next;
      }

      return resultHead.next;
   }

   public Node copyRandomList(Node head) {
      Node headCopy = head;
      while(head!=null) {
         Node copy = new Node(head.val);
         copy.next = head.next;
         head.next = copy;
         head = copy.next;
      }
      head = headCopy;
      while(head!=null) {
         Node copy = head.next;
         copy.random = head.random == null ? null : head.random.next;
         head = copy.next;
      }
      head = headCopy;
      Node result = head.next;
      while(head!=null) {
         Node copy = head.next;
         head.next = head.next.next;
         copy.next = copy.next == null ? null : copy.next.next;
         head = head.next;
      }
      return result;
   }
}