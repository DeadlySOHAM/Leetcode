package RemoveDuplicatesFromSortedLinkedList;

// 83

public class RemoveDuplicatesFromSortedLinkedList {
   
   public static void main(String[] args) {
      Solution s = new Solution();
      print(s.deleteDuplicates(asLinkedList(new int[]{1,1,2,3,4,5}))); 
      print(s.deleteDuplicates(asLinkedList(new int[]{1,2,2,3,4,5}))); 
      print(s.deleteDuplicates(asLinkedList(new int[]{1,2,3,3,4,5}))); 
      print(s.deleteDuplicates(asLinkedList(new int[]{1,2,3,4,4,5})));
      print(s.deleteDuplicates(asLinkedList(new int[]{1,2,3,4,5,5})));
      
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
