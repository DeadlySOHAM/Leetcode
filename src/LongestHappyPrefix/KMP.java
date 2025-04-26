package LongestHappyPrefix;

import java.util.*;


public class KMP {

   public static void main(String[] args) {
      System.out.println(Arrays.toString(genLPS("abcab")));
      System.out.println(Arrays.toString(genLPS("abcdabeabf")));
      System.out.println(Arrays.toString(genLPS("abcdeabfabc")));
      System.out.println(Arrays.toString(genLPS("aabcadaabe")));
      System.out.println(Arrays.toString(genLPS("aaaabaacd")));
      System.out.println(Arrays.toString(genLPS("ddbbbbcddd")));
   }

   public static int[] genLPS(String text) {
      int[] lps = new int[text.length()];
      int pointer = 0, i=1;
      lps[0] = 0;
      while(i<text.length()){
         if(text.charAt(i)==text.charAt(pointer)){
            pointer++;
            lps[i] = pointer;
            i++;
         } else {
            if(pointer!=0){
               pointer = lps[pointer-1];
            } else {
               lps[i++] = 0;
            }
         }
      }
      return lps;
   }
}
