// Backtracking

package TwoSum;

class Solution {
   public int[] twoSum(int[] nums, int target) {
      int n = 2, x[] = new int[n], i = 0;
      while (true){
         System.out.println("Starting with : "+i);
         if(backtrack(nums, i++, x, 0, target, 0)) 
            break;
      }
      return x;
   }

   private boolean backtrack(int a[], int da, int b[], int db, int target, int sum) {
      sum += a[da];
      System.out.println(sum);
      if (db == b.length - 1 && sum == target) {
         b[db] = da;
         System.out.println("Success" + sum);
         return true;
      } else if (db == b.length - 1 && sum != target) {
         System.out.println("Fail 2 : " + sum);
      } else if (db < b.length - 1) {
         b[db] = da;
         System.out.println("Not yet : " + sum);
         System.out.println("Added " + da + " in " + db);
         for (int i = da+1 ; i < a.length; i++) {
            System.out.println("Substarting from " + i + " with sum "+sum+" and db "+(db+1));
            if (backtrack(a, i , b, db + 1, target, sum))
               return true;
         }
      }
      System.out.println("Wrong Pass " + sum + " --> " +db);
      return false;
   }
}