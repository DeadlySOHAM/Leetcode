package RemoveAllAdjacentDuplicatesInString;

public class Solution {

   public String removeDuplicates(String s) {
      StringBuilder sb = new StringBuilder(s);
      for(int i=0;i<sb.length()-1;i++) {
         if(sb.charAt(i)==sb.charAt(i+1)) {
            sb.deleteCharAt(i);
            sb.deleteCharAt(i);
            i = Math.max(-1,i-=2);
            // return removeDuplicates(sb,Math.max(0,i-1));
         }
      }
      return sb.toString();
   }

   private String removeDuplicates(StringBuilder sb, int start) {
      for(int i=start;i<sb.length()-1;i++) {
         if(sb.charAt(i)==sb.charAt(i+1)){
            sb.deleteCharAt(i);
            sb.deleteCharAt(i);
            return removeDuplicates(sb,Math.max(0,i-1));
         }
      }
      return sb.toString();
   }
}
