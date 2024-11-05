package NextPermutation;

class NextPermutation{
   public static void main(String[] args){
      int[][] arr = {
         {3,1,2},
         {3,2,1},
         {5,4,3,2,1},
         {1,5,4,3,2},
         {10,1,8,7,9,6,5}
      };
      Solution solution = new Solution();
      for(int[] elem : arr){
         solution.nextPermutation(elem);
         print(elem);
      }
   }

   public static void print(int[] elem){
      System.out.print("[");
      for(int i=0;i<elem.length;i++) {
         System.out.print(elem[i]+(i+1==elem.length?"":","));
      }
      System.out.println("]");
   }
}