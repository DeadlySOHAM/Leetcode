package MedianOf2SortedArray;

// 4

public class MedianOf2SortedArray {
   public static void main(String[] args){
      Solution2 s = new Solution2();
      System.out.println(s.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
      System.out.println(s.findMedianSortedArrays(new int[]{1,3}, new int[]{2,4}));
      System.out.println(s.findMedianSortedArrays(new int[]{1,3,5}, new int[]{2,4}));
      System.out.println(s.findMedianSortedArrays(new int[]{1,5,4}, new int[]{2,3}));
      System.out.println(s.findMedianSortedArrays(new int[]{1,2,3,4,5}, new int[]{6}));
   }
}
