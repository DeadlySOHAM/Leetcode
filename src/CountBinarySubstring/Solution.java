package CountBinarySubstring;

import java.util.*;

public class Solution {

   public int countBinarySubstrings(String s) {
      char[] ch = s.toCharArray();
      s=null;
      int count = 0, i=0;
      while(i+1<ch.length){
         count += getCount(ch, i, ++i);
      }
      return count;
   }

   public int getCount(char[] ch, int dx, int dy){
      if(ch[dx]==ch[dy]) return 0;
      char initialX = ch[dx], initialY = ch[dy];
      int count=0;
      while(dx>=0 && dy<ch.length && ch[dx]!=ch[dy] && ch[dx]==initialX && ch[dy]==initialY){
         count++;
         --dx;
         ++dy;
      }
      return count;
   }
}
