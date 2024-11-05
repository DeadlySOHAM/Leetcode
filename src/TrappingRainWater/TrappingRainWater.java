package TrappingRainWater;

public class TrappingRainWater{
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
      System.out.println(s.trap(new int[]{4,2,0,3,2,5}));
      System.out.println(s.trap(new int[]{5,2,3,0,2,4}));
      System.out.println(s.trap(new int[]{3,0,0,2,0,4}));
      System.out.println(s.trap(new int[]{7,4,0,9}));
      System.out.println(s.trap(new int[]{0,1,2,3,2,1,0}));
      System.out.println(s.trap(new int[]{5,4,3,2,1,0,1,2,3}));
   }
}