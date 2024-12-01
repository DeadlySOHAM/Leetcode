package Permutations;

// 46

class Permutations{
   public static void main(String[] args){
      Solution s = new Solution();
      System.out.println(s.permute(new int[]{0}));
      System.out.println(s.permute(new int[]{0,1}));
      System.out.println(s.permute(new int[]{1,2,3}));
   }
}