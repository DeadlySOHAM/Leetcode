package ReverseNodesInKGroups;

// 25

class ReverseNodesInKGroups {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println("\n\n");
      print(s.reverseKGroup(asLinkedList(new int[]{1,2,3,4,5}), 2)); // 2 1 4 3 5
      print(s.reverseKGroup(asLinkedList(new int[]{1,2,3,4,5}), 3)); // 3 2 1 4 5
      print(s.reverseKGroup(asLinkedList(new int[]{1,2,3,4,5}), 1)); // 1 2 3 4 5
      print(s.reverseKGroup(asLinkedList(new int[]{1,2,3,4,5}), 5)); // 5 4 3 2 1
      print(s.reverseKGroup(asLinkedList(new int[]{3,5,4,7,7,9,8,3,1,8,6}), 3)); // 4 5 3 9 7 7 1 3 8 6 8
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