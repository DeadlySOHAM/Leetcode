package SortList;

// 148

public class SortList {
   
   public static void main(String[] args) {
      // Solution s = new Solution();
      Solution2 s = new Solution2();
      print(s.sortList(asLinkedList(new int[]{5,4,3,2,1})));
      print(s.sortList(asLinkedList(new int[]{4,2,1,3})));
      print(s.sortList(asLinkedList(new int[]{-1,5,3,4,0})));
      print(s.sortList(asLinkedList(new int[]{-1})));
      print(s.sortList(asLinkedList(new int[]{})));
   }
   
   public static ListNode asLinkedList(int[] arr) {
      if(arr.length<=0) return null;
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
