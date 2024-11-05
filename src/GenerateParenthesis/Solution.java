package GenerateParenthesis;

import java.util.*;

public class Solution {
   public List<String> generateParenthesis(int n) {
      if(n==1) return new ArrayList<String>(){{add("()");}};
      List<String> a = recursiveProcess(n, 1, 0, true),
                  result = new ArrayList<String>();
      if(a!=null)
         for(String s : a)
            result.add(s);
      return result;
   }
   private List<String> recursiveProcess(int n,int opens,int closes,boolean isOpen){
      if(closes>opens || opens>n) return null;
      String current = isOpen?"(":")";
      if(opens==n && closes<=n){
         while(closes++<n)
            current+=")";
         return Arrays.asList(current);
      }
      List<String> a = recursiveProcess(n, opens+1, closes, true),
                  b = recursiveProcess(n, opens, closes+1, false),
                  result = new ArrayList<String>();
      if(a==null && b==null) return Arrays.asList(current);
      if(a!=null)
         for(String s : a)
            result.add(current+s);
      if(b!=null)
         for(String s : b)
            result.add(current+s);
      return result;
   
   }
}
