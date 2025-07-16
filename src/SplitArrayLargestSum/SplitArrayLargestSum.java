package SplitArrayLargestSum;

// 410

public class SplitArrayLargestSum {
   public static void main(String args[]) {
      Solution s = new Solution();
      System.out.println(s.splitArray(new int[] { 5, 10, 30, 20, 15 }, 3)); // 35
      System.out.println(s.splitArray(new int[] { 10, 20, 30, 40 }, 2)); // 60
      System.out.println(s.splitArray(new int[] { 100, 200, 300, 400 }, 1)); // 1000
      System.out.println(s.splitArray(new int[] { 4, 2, 22, 8, 2, 11, 19, 13 }, 3)); // 32
      System.out.println(s.splitArray(new int[] { 10, 5, 20, 25, 17, 23, 2, 9, 4, 13 }, 7)); // 25
      System.out.println(s.splitArray(new int[] { 7, 2, 5, 10, 8 }, 2)); // 18
      System.out.println(s.splitArray(new int[] { 1, 2, 3, 4, 5 }, 2)); // 9
      System.out.println(s.splitArray(new int[] { 1,4,4 }, 3)); // 4
   }
}
