package FlattenAMultilevelDoublyLinkedList;

import java.util.*;

// 430

class FlattenAMultilevelDoublyLinkedList {

   public static void main(String[] args) {
      Solution2 s = new Solution2();
      print(s.flatten(
            arrayAsLinkedList(new Integer[] { 1, 2, 3, 4, 5, 6, null, null, null, 7, 8, 9, 10, null, null, 11, 12 })));
      print(s.flatten(arrayAsLinkedList(new Integer[] { 1, 2, null, 3 })));
      print(s.flatten(arrayAsLinkedList(new Integer[0])));
   }

   public static Node arrayAsLinkedList(Integer[] arr) {
      if (arr == null || arr.length == 0)
         return null;

      List<Node> levelHeads = new ArrayList<>();
      List<Node> upperLevelNodes = new ArrayList<>();

      int i = 0;
      Node head = null;
      Node prev = null;

      head = new Node(arr[0], null, null, null);
      prev = head;
      upperLevelNodes.add(head);

      i = 1;
      while (i < arr.length && arr[i] != null) {
         Node node = new Node(arr[i], prev, null, null);
         prev.next = node;
         prev = node;
         upperLevelNodes.add(node);
         i++;
      }

      levelHeads.add(head);
      while (i < arr.length) {
         int nullCount = 0;
         while (i < arr.length && arr[i] == null) {
            nullCount++;
            i++;
         }
         if (i >= arr.length)
            break;

         Node parent = null;
         if (nullCount - 1 < upperLevelNodes.size()) {
            parent = upperLevelNodes.get(nullCount - 1);
         }

         Node childHead = new Node(arr[i], null, null, null);
         prev = childHead;
         i++;
         while (i < arr.length && arr[i] != null) {
            Node node = new Node(arr[i], prev, null, null);
            prev.next = node;
            prev = node;
            i++;
         }

         if (parent != null) {
            parent.child = childHead;
         }

         upperLevelNodes = new ArrayList<>();
         Node tmp = childHead;
         while (tmp != null) {
            upperLevelNodes.add(tmp);
            tmp = tmp.next;
         }
      }

      return head;
   }

   public static void print(Node head) {
      while (head != null) {
         System.out.print(head.val);
         System.out.print(head.next == null ? "\n" : "\t");
         head = head.next;
      }
   }
}
