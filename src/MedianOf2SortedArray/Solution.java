package MedianOf2SortedArray;

// normal approach : O(n/2)

public class Solution {

   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int elem1 = 0, elem2 = 0, i = 0, dnm1 = 0, dnm2 = 0, totalLength = nums1.length + nums2.length,
            midOdd = (totalLength) / 2, midEven = midOdd - 1;
      while (i <= midOdd) {
         int current = 0;
         if (dnm1 < nums1.length && dnm2 < nums2.length && nums1[dnm1] <= nums2[dnm2]) {
            current = nums1[dnm1++];
         } else if (dnm1 < nums1.length && dnm2 < nums2.length && nums1[dnm1] > nums2[dnm2]) {
            current = nums2[dnm2++];
         } else if (dnm1 < nums1.length && dnm2 >= nums2.length) {
            current = nums1[dnm1++];
         } else {
            current = nums2[dnm2++];
         }
         if (i == midOdd)
            elem1 = current;
         else if (i == midEven)
            elem2 = current;
         i++;
      }
      return totalLength % 2 == 0 ? (elem1 + elem2) / 2.0 : (double) elem1;
   }
}
