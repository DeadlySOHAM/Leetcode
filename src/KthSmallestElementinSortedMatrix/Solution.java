package KthSmallestElementinSortedMatrix;

import java.util.*;

public class Solution {
   public int kthSmallest(int[][] matrix, int k) {
      PriorityQueue<Pair> pq = new PriorityQueue<Pair>(matrix.length, (a, b) -> a.num.compareTo(b.num));
      for (int i = 0; i < matrix.length; i++) {
         pq.add(new Pair(matrix[i][0], i, 0));
      }
      while (k-- > 1) {
         Pair p = pq.poll();
         if (p.y + 1 < matrix[p.x].length)
            pq.add(new Pair(matrix[p.x][p.y + 1], p.x, p.y + 1));
      }
      return pq.poll().num;
   }

   private static class Pair {
      public final Integer num, x, y;

      public Pair(int num, int x, int y) {
         this.num = num;
         this.x = x;
         this.y = y;
      }
   }
}