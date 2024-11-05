package SubstringwithConcatenationofAllWords;

import java.util.*;

public class Solution {

   HashMap<Integer,Integer> recursionMemory = new HashMap<Integer,Integer>();

   public List<Integer> findSubstring(String s, String[] words) {

      List<Integer> result = new ArrayList<Integer>();
      List<String> memory = new ArrayList<String>(Collections.nCopies(s.length(),null));
      List<String> taken = new ArrayList<>(Arrays.asList(words));

      System.out.println("Starting getting index");

      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         for (int j = 0; j < words.length; j++) {
            String word = words[j];
            if (word.charAt(0) == c && i + word.length() <= s.length()
                  && word.equals(s.substring(i, i + word.length()))) {
                     memory.set(i,word);
               break;
            }
         }
      }
      
      System.out.println("Done getting index");

      for(int i=0;i<memory.size();i++) {
         if(memory.get(i)!=null) {
            int res = check(i,memory,new ArrayList<String>(taken));
            if(res > -1) {
               result.add(i);
               if(res == memory.size()-1)
                  break;
            }
         }
      }

      return result;
   }

   public int check(int current, List<String> memory, List<String> taken){
      boolean status = taken.remove(memory.get(current));
      if(!status) return -1;
      if(taken.size()==0)          return current;
      int next = current+memory.get(current).length();
      if(next>=memory.size())
         return taken.size()==0? current : -1;
      if(memory.get(next) == null)
         return taken.size()==0? current : -1;
      return check(next, memory, taken);
   }

}
