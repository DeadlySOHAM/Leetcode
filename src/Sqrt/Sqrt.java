package Sqrt;

// 69

class Sqrt {
   public static void main(String[] args) {
      Solution s = new Solution();
      int failed = 0;
      for(int i=0;i<=Integer.MAX_VALUE;i++) {
         int result = s.mySqrt(i);
         if(result != (int)Math.sqrt(i)) {
            System.out.println(i+"::"+result+"/"+Math.sqrt(i));
            failed++;
            break;
         }
      }
      System.out.println("done : "+failed);
      // System.out.println("131074 :: "+s.mySqrt(131074) + "/"+Math.sqrt(131074));
   }
}