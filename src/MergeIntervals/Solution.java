package MergeIntervals;

import java.util.*;

class Solution {
   public int[][] merge(int[][] intervals) {

      if (intervals.length == 1){
         if(intervals[0][0]>intervals[0][1])
            return new int[][]{{intervals[0][1],intervals[0][0]}};
         return intervals;
      }

      Arrays.sort(intervals,new Comparator<int[]>(){

         @Override
         public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0], o2[0]);
         }

      });
      
      ArrayList<int[]> tempResult = new ArrayList<int[]>();

      for(int[] elem : intervals){
         checkListAndAdd(tempResult, elem[0], elem[1]);
      }

      int[][] result = new int[tempResult.size()][2];
      for(int i=0;i<result.length;i++)
         result[i] = tempResult.get(i);

      return result;
   }

   private static void checkListAndAdd(ArrayList<int[]> tempResult, int c, int d) {
      if(tempResult.size()==0) tempResult.add(new int[]{c,d});
      else {
         int[] last = tempResult.get(tempResult.size()-1);
         int a = last[0], b = last[1];
         if(b<c) tempResult.add(new int[]{c,d});
         else if(d<a) {
            tempResult.remove(last);
            tempResult.add(new int[]{a,b});
            tempResult.add(last);
         }
         else if(b>=c || a>=c) {
            tempResult.remove(last);
            tempResult.add(new int[]{Math.min(a,c),Math.max(b,d)});
         };
      }
   }
}