package CopyListWithRandomPointer;

import java.util.*;

class CopyListWithRandomPointer {

   public static void main(String[] args) {
      Solution s = new Solution();
      print(s.copyRandomList(arrayAsLinkedList(new Integer[][] { { 7, null }, { 13, 0 }, { 11, 4 }, { 10, 2 }, { 1, 0 } })));
      print(s.copyRandomList(arrayAsLinkedList(new Integer[][] { { 1, 1 }, { 2, 1 } })));
      print(s.copyRandomList(arrayAsLinkedList(new Integer[][] { { 3, null }, { 3, 0 }, { 3, null } })));
   }

   private static Node arrayAsLinkedList(Integer[][] integers) {
      if (integers == null || integers.length == 0)
         return null;

      Node[] nodes = new Node[integers.length];
      for (int i = 0; i < integers.length; i++) {
         nodes[i] = new Node(integers[i][0]); 
      }

      for (int i = 0; i < integers.length - 1; i++) {
         nodes[i].next = nodes[i + 1];
      }

      for (int i = 0; i < integers.length; i++) {
         Integer randomIndex = integers[i][1]; 
         if (randomIndex != null) {
            nodes[i].random = nodes[randomIndex];
         }
      }

      return nodes[0];
   }

   private static void print(Node head) {
      if (head == null) {
         System.out.println("[]");
         return;
      }

      HashMap<Node, Integer> indexMap = new HashMap<>();
      Node curr = head;
      int idx = 0;
      while (curr != null) {
         indexMap.put(curr, idx++);
         curr = curr.next;
      }

      StringBuilder sb = new StringBuilder();
      sb.append("[");
      curr = head;
      while (curr != null) {
         Integer randomIndex = curr.random == null ? null : indexMap.get(curr.random);
         sb.append("[").append(curr.val).append(",")
               .append(randomIndex == null ? "null" : randomIndex).append("]");
         curr = curr.next;
         if (curr != null)
            sb.append(",");
      }  
      sb.append("]");

      System.out.println(sb.toString());
   }

}