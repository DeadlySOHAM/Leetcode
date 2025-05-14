package RestoreIPAddresses;

import java.util.*;

public class Solution {

   public List<String> restoreIpAddresses(String s) {
      List<String> result = new ArrayList<String>();
      if(s.length()<4) return result;

      for (int a=1; a<=3 && a<=s.length(); a++) {
         String s_a = s.substring(0,a);
         if((s_a.length()>1 && s_a.charAt(0)=='0') || Integer.parseInt(s_a)>255) continue;
         for (int b=a+1; b<=a+3 && b<=s.length(); b++) {
            String s_b = s.substring(a,b);
            if((s_b.length()>1 && s_b.charAt(0)=='0') || Integer.parseInt(s_b)>255) continue;
            for (int c=b+1; c<=b+3 && c<=s.length(); c++) {
               String s_c = s.substring(b,c);
               if((s_c.length()>1 && s_c.charAt(0)=='0') || Integer.parseInt(s_c)>255) continue;
               String s_d = s.substring(c,s.length());
               try {
                  if(s_d.length()<1 || (s_d.length()>1 && s_d.charAt(0)=='0') || Integer.parseInt(s_d)>255) continue;
                  result.add(s_a+"."+s_b+"."+s_c+"."+s_d);
               } catch(NumberFormatException e) {
                  continue;
               }
      }}}
      return result;
   }
}
