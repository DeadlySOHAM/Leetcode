package LongestHappyPrefix;

public class Solution {

   public String longestPrefix(String s) {
      if(s.length()<=1) return "";
      int pointer=0, i=1;
      int[] lps = new int[s.length()];
      while(i<s.length()){
         if(s.charAt(pointer)==s.charAt(i)){
            pointer++;
            lps[i++] = pointer;
         } else {
            if(pointer!=0)    pointer = lps[pointer-1];
            else lps[i++] = 0;
         }
      }
      return s.substring(0, lps[lps.length-1]);
   }
}
