package MinimumWindowSubstring;

import java.util.*;

class Solution {

   public String minWindow(String s, String t) {
      HashMap<Character,Integer> orginalTable = new HashMap<Character,Integer>() {{
         for(int i=0;i<t.length();i++)
            put(t.charAt(i),getOrDefault(t.charAt(i), 0)+1);
      }};
      HashMap<Character,Integer> traversingTable = new HashMap<Character,Integer>(orginalTable);
      int windowSize = 0, requiredWindowSize = t.length(), right=0, left=0;
      String result = "";
      do {
         char chr = s.charAt(right);
         if(traversingTable.containsKey(chr)) {
            int count = traversingTable.get(chr);
            traversingTable.put(chr,count-1);
            if(count>0) windowSize++;
         }
         while(windowSize>=requiredWindowSize && left<=right) {
            String temp = s.substring(left,right+1);
            if(result.equals("") || temp.length()<result.length()) result = temp;
            char chl = s.charAt(left);
            if(traversingTable.containsKey(chl)) {
               int count = traversingTable.get(chl);
               traversingTable.put(chl,count+1);
               if(count>=0) windowSize--;
            }
            left++;
         }

      } while(++right<s.length());
      return result;
   }

}