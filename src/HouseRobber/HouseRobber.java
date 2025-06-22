package HouseRobber;

// 198

class HouseRobber {
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.rob(new int[]{1,2,3,1}));
      System.out.println(s.rob(new int[]{2,7,9,3,1}));
      System.out.println(s.rob(new int[]{6, 5, 5, 7, 4}));
      System.out.println(s.rob(new int[]{1,5,3}));
      System.out.println(s.rob(new int[]{4,4,4,4}));
   }
}