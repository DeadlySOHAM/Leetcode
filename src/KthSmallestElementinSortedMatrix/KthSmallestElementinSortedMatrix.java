package KthSmallestElementinSortedMatrix;

// 378

public class KthSmallestElementinSortedMatrix {
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.kthSmallest(new int[][] {{1,5,9},{10,11,13},{12,13,15}}, 8)); // 13
      System.out.println(s.kthSmallest(new int[][] {{1,5,9},{10,11,13},{12,13,15}}, 9)); // 15 
      System.out.println(s.kthSmallest(new int[][] {{-5}}, 1)); // -5
   }
}
