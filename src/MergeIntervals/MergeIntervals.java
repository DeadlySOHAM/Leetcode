package MergeIntervals;

// 56

public class MergeIntervals {

   public static void main(String[] args) {
      int[][] arr = {{1,3},{8,10},{15,18},{2,6}},
               arr2 = {{1,4},{4,5}},
               arr3 = {{1,4},{0,1}},
               arr4 = {{1,4},{0,0}},
               arr5 = {{1,4},{0,4}},
               arr6 = {{1,4},{0,2},{3,5}},
               arr7 = {{2,3},{5,5},{2,2},{3,4},{3,4}};

      Solution solution = new Solution();
      println(solution.merge(arr));
      println(solution.merge(arr2));
      println(solution.merge(arr3));
      println(solution.merge(arr4));
      println(solution.merge(arr5));
      println(solution.merge(arr6));
      println(solution.merge(arr7));
   }

   public static void println(int[][] arr){
      for(int i=0;i<arr.length;i++) {
         System.out.print("[");
         for( int j=0;j<arr[i].length;j++) {
            System.out.print(arr[i][j]+(j+1==arr[i].length?"":","));
         }
         System.out.print("]");
      }
      System.out.println();
   }
}
