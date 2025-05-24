package GroupAnagrams;

import java.util.*;

public class Solution {

   public List<List<String>> groupAnagrams(String[] strs) {
      
      ArrayList<Node> arn = new ArrayList<>(){{
         for(String str : strs)
            add(new Node(str));
      }};

      List<List<String>> result = new ArrayList<List<String>>(){{
         for(int i=0;i<arn.size();i++) {
            if(arn.get(i)==null) continue;
            Node a = arn.get(i);
            arn.set(i, null);
            add(new ArrayList<String>(){{add(a.s);}});
            for(int j=0;j<arn.size();j++) {
               if(arn.get(j)==null) continue;
               if(Node.isAnagram(a, arn.get(j))){
                  get(size()-1).add(arn.get(j).s);
                  arn.set(j,null);
               }
            }
         }
      }};
      return result;
   }

   private class Node {

      public String s;
      public HashMap<Character,Integer> table;
      
      public Node(String s) {
         this.s = s;
         this.table = new HashMap<Character,Integer>(){{
            for(int i=0;i<s.length();i++)
               put(s.charAt(i),getOrDefault(s.charAt(i), 0)+1);
         }};
      }

      public static boolean isAnagram(Node a, Node b) {
         if(a.table.keySet().size()!=b.table.keySet().size()) return false;
         for(Character c : a.table.keySet()) 
            if(!b.table.containsKey(c)) return false;
            else if(a.table.get(c)!=b.table.get(c)) return false;
         return true;
      }

   }

}
