package PalindromeLinkedList;

class PalindromeLinkedList {

   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,2,2,1})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,2,3,4})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,2,1,2,1})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,2,3,4,5})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,1})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1,2})));
      System.out.println(s.isPalindrome(asLinkedList(new int[]{1})));
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