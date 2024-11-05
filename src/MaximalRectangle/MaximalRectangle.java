package MaximalRectangle;

// 85

public class MaximalRectangle {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.maximalRectangle(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
      System.out.println(s.maximalRectangle(new char[][]{{'0'}}));
      System.out.println(s.maximalRectangle(new char[][]{{'1'}}));
      System.out.println(s.maximalRectangle(new char[][]{{'0','1'},{'1','0'}})); // 1
      System.out.println(s.maximalRectangle(new char[][]{{'1','0','1','1','1'},{'0','1','0','1','0'},{'1','1','0','1','1'},{'1','1','0','1','1'},{'0','1','1','1','1'}})); // 6
   }
}
