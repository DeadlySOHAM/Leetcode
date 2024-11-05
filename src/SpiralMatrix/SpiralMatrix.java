package SpiralMatrix;

public class SpiralMatrix {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
      System.out.println(s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}));
      System.out.println(s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}}));
      System.out.println(s.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8}}));
      System.out.println(s.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
      System.out.println(s.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
   }
}
