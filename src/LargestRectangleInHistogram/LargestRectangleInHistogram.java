package LargestRectangleInHistogram;

// 84

public class LargestRectangleInHistogram {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.largestRectangleArea(new int[]{6, 2, 5, 4, 5, 1, 6})); // 12
      System.out.println(s.largestRectangleArea(new int[]{7, 2, 8, 9, 1, 3, 6, 5})); // 16
      System.out.println(s.largestRectangleArea(new int[]{2,1,5,6,2,3})); // 10
      System.out.println(s.largestRectangleArea(new int[]{6,5,1,2})); // 10
      System.out.println(s.largestRectangleArea(new int[]{2,4})); // 4
      System.out.println(s.largestRectangleArea(new int[]{2,5})); // 5
      System.out.println(s.largestRectangleArea(new int[]{5,2})); // 5
   }
}
