package MergeKSortedList;

public class MergeKSortedList {
   
   public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static void main(String[] args){
      print(new Solution().mergeKLists(getList(new int[][]{{1,4,5},{1,3,4},{2,6}})));
      print(new Solution().mergeKLists(getList(new int[][]{{2,3,5},{1,2,5},{3,4}})));
   }
   
   private static ListNode[] getList(int[][] ar){
      ListNode[] list = new ListNode[ar.length];
      for(int i=0;i<ar.length;i++){
         ListNode node = null;
         for(int j=0;j<ar[i].length;j++){
            if(node==null){
               node = new ListNode(ar[i][j],null);
               list[i] = node;
            }else{
               node.next = new ListNode(ar[i][j],null);
               node = node.next;
            }
         }
      }
      return list;
   }

   private static void print(ListNode node){
      while(node!=null){
         System.out.print(node.val+"->");
         node = node.next;
      }
      System.out.println();
   }

}
