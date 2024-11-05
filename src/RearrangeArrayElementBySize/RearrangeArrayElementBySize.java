package RearrangeArrayElementBySize;

// 2149

public class RearrangeArrayElementBySize {
   public static void main(String[] args){
      // Solution s = new Solution();
      Solution2 s = new Solution2();
      println(s.rearrangeArray(new int[]{3,1,-2,-5,2,-4}));
      println(s.rearrangeArray(new int[]{-1,1}));
      println(s.rearrangeArray(new int[]{-1,-2,-3,1,2,3}));
      println(s.rearrangeArray(new int[]{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31}));
   }
   
   public static void println(int[] arr){
      System.out.print("[");
      for( int i=0;i<arr.length;i++) {
         System.out.print(arr[i]+(i+1==arr.length?"":","));
      }
      System.out.println("]");
   }
}
