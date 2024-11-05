package SearchIn2DMatrix;

// 74

public class SearchIn2DMatrix {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6}}, 3));
      System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6}}, 8));
      System.out.println(s.searchMatrix(new int[][]{{4,5,6},{7,8,9}}, 3));
      System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 8));
      System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 10));
      System.out.println(s.searchMatrix(new int[][]{{4,5,6},{7,8,9},{10,11,12}}, 3));
   }
}
