package ReverseLinkedList;

// 206

public class ReverseLinkedList {

   public static void main(String args[]){
      Solution s = new Solution();
      print(s.reverseList(asLinkedList(new int[]{1,2,3,4,5})));
   }

   public static ListNode asLinkedList(int[] arr) {
      ListNode head = new ListNode(arr[0]);
      ListNode headReturn = head;
      for(int i=1;i<arr.length;i++) {
         head.next = new ListNode(arr[i]);
         head = head.next;
      }
      return headReturn;
   }

   public static void print(ListNode head) {
      while(head!=null) {
         System.out.print(head.val);
         if(head.next!=null) System.out.print("--->");
         head = head.next;
      }
   }
}
