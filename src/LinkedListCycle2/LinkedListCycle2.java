package LinkedListCycle2;

// 142

public class LinkedListCycle2 {
   
   public static void main(String[] args) {
      Solution s = new Solution();
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 5)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 4)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 3)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 2)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 1)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, 0)));
      print(s.detectCycle(asLinkedList(new int[]{1,2,3,4,5}, -1)));
   }

   public static ListNode asLinkedList(int[] arr, int loopConnectAt) {
      ListNode head = null, headReturn = null, loopConnect = null;
      for(int i=0;i<arr.length;i++) {
         if(head==null){
            head = new ListNode(arr[i]);
            headReturn = head;
         } else {
            head.next = new ListNode(arr[i]);
            head = head.next;
         }
         if(i==loopConnectAt) loopConnect = head;
      }
      head.next = loopConnect;
      return headReturn;
   }
   
   public static void print(ListNode head) {
      if(head==null) System.out.println("null");
      int protection = 0, threshold = 20 ;
      while(head!=null && protection++<threshold) {
         System.out.print(head.val);
         if(head.next!=null) System.out.print("--->");
         else System.out.println();
         head = head.next;
      }
      if(protection>=threshold) System.out.println("... to the infinity");
   }
}
