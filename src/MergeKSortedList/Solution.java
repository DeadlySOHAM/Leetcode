package MergeKSortedList;

import MergeKSortedList.MergeKSortedList.ListNode;

public class Solution {
   public ListNode mergeKLists(ListNode[] lists) {
      ListNode tempResult = null,finalResult = null;
      while(true){
         int min = -1;
         for(int j=0;j<lists.length;j++){
            if(lists[j]==null)continue;
            if(min == -1) min = j;
            else min = lists[j].val<lists[min].val?j:min;
         }
         if(min==-1) break;
         if(tempResult==null){
            tempResult = lists[min];
            finalResult = tempResult;
         }else{
            tempResult.next = lists[min];
            tempResult = tempResult.next;
         }
         lists[min] = lists[min].next;
      }
      return finalResult;
   }   
}
