package RotateString;

public class Solution {
   
   public boolean rotateString(String s, String goal) {
      if (s.length() != goal.length())
         return false;
      String temp = s + s;
      int[] lps = new int[temp.length()];
      int pointer = 0, i = 1;
      lps[0] = 0;
      while (i < temp.length()) {
         if (temp.charAt(i) == goal.charAt(pointer)) {
            pointer++;
            lps[i] = pointer;
            i++;
         } else {
            if (pointer != 0) {
               pointer = lps[pointer - 1];
            } else {
               lps[i++] = 0;
            }
         }
         if (pointer >= goal.length())
            return true;
      }
      return false;
   }
}
