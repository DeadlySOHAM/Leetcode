package RemoveNthNode;

public class RemoveNthNodeFromLast {

   public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static void main(String[] args){
      print(new Solution().removeNthFromEnd(getList(new int[]{1,2,3,4,5}), 2));
      print(new Solution().removeNthFromEnd(getList(new int[]{1}), 1));
      print(new Solution().removeNthFromEnd(getList(new int[]{1,2}), 1));
   }

   private static ListNode getList(int[] ar){
      ListNode node = null;
      ListNode head = null;
      for(int i=0;i<ar.length;i++){
         if(node==null){
            node = new ListNode(ar[i],null);
            head = node;
         }else{
            node.next = new ListNode(ar[i],null);
            node = node.next;
         }
      }
      return head;
   }

   private static void print(ListNode node){
      while(node!=null){
         System.out.print(node.val+"->");
         node = node.next;
      }
      System.out.println();
   }

}
