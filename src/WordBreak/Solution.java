package WordBreak;

import java.util.*;

public class Solution {

   public boolean wordBreak(String s, List<String> wordDict) {
      Set<String> map = new HashSet<String>(wordDict);
      Boolean[] memory = new Boolean[s.length()];
      return recurse(s, 0, map, memory);
   }

   public boolean recurse(String s, int pointer, Set<String> map, Boolean[] memory) {
      if(pointer>=s.length()) return true;
      else if(memory[pointer]!=null) return memory[pointer];
      String word = "";
      for (int i=pointer;i<s.length();i++) {
         word+= s.charAt(i);
         if(map.contains(word) && recurse(s, i+1, map, memory)) {
            memory[pointer] = true;
            return true;
         }
      }
      memory[pointer] = false;
      return false;
   }
}
