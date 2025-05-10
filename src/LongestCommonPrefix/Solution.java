package LongestCommonPrefix;

class Solution {
   public String longestCommonPrefix(String[] strs) {
      if (strs.length < 1)
         return "";
      int i = 0;
      String result = "";
      char key = '*';
      while (true) {
         try {
            key = strs[0].charAt(i);
         } catch (Exception e) {
            // System.out.println("Returning due to invalid length");
            return result;
         }
         for (int j = 0; j < strs.length; j++) {
            if (i < strs[j].length()) {
               if (strs[j].charAt(i) != key) {
                  // System.out.println("Returning due to mismatch : " + key + "\t" + j + "\t" + i);
                  return result;
               }
            } else {
               // System.out.println("Returning due to limit : " + result);
               return result;
            }
         }
         // System.out.println("Adding : " + key);
         result += key;
         // System.out.println("Result : " + result);
         ++i;
      }
   }
}
