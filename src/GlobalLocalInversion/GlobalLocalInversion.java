package GlobalLocalInversion;

// Incomplete

public class GlobalLocalInversion{
   public static void main(String[] args){
      Solution s = new Solution(); 
      System.out.println(s.isIdealPermutation(new int[]{1,0,2}));  
      System.out.println(s.isIdealPermutation(new int[]{1,2,0})); 
      System.out.println(s.isIdealPermutation(new int[]{0,2,1,3})); // true
   }
}