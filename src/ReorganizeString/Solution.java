package ReorganizeString;

import java.util.*;

class Solution {

   public String reorganizeString2(String s) {

      HashMap<Character, Integer> table = new HashMap<Character, Integer>(Math.min(27, s.length())) {
         {
            for (int i = 0; i < s.length(); i++)
               put(s.charAt(i), getOrDefault(s.charAt(i), 0) + 1);
         }
      };
      System.out.println(table.keySet());
      char[] result = new char[s.length()];

      for (Character ch : table.keySet()) {
         table.put(ch, table.get(ch) - 1);
         result[0] = ch;
         if (recurseDFS(result, 1, table))
            return new String(result);
         table.put(ch, table.get(ch) + 1);
      }

      return "";
   }

   private boolean recurseDFS(char[] c, int i, HashMap<Character, Integer> record) {
      if (i == c.length)
         return true;
      else {
         for (Character cha : record.keySet()) {
            if (cha == c[i - 1] || record.get(cha) <= 0)
               continue;
            record.put(cha, record.get(cha) - 1);
            c[i] = cha;
            if (recurseDFS(c, i + 1, record))
               return true;
            record.put(cha, record.get(cha) + 1);
         }
         return false;
      }
   }

   // best result
   public String reorganizeString(String s) {

      HashMap<Character, Node> table = new HashMap<Character, Node>(Math.min(27, s.length())) {{
            for (int i = 0; i < s.length(); i++)
               if(containsKey(s.charAt(i)))
                  get(s.charAt(i)).increment();
               else
                  put(s.charAt(i),new Node(s.charAt(i)));
         }};

      PriorityQueue<Node> pQueue = new PriorityQueue<Node>(table.keySet().size(),Node::compareTo) {{
         for(Character ch : table.keySet())
            add(table.get(ch));
      }};
      
      char[] result = new char[s.length()];
      int i=1;

      Node aside = pQueue.poll();
      result[0] = aside.getChar();

      while(i<result.length) {
         Node n = pQueue.poll();
         if(n==null) return "";
         result[i++] = n.getChar();
         if(aside.count>0)
            pQueue.add(aside);
         aside = n;
      }
      return new String(result);
   }

   private class Node {

      public int count=0;
      public char charcter;

      public Node(char c){
         this.charcter=c;
         this.count=1;
      }

      public Node increment() {++this.count; return this;}

      public static int compareTo(Node a,Node b){
         return a.count==b.count?0:
            a.count>b.count?-1:1;
      }

      public char getChar() {
         --this.count;
         return this.charcter;
      }

      public String toString() {
         return "{"+this.charcter+":"+this.count+"}";
      }
   }

}
