package PopulatingNextRightPointersInEachNode;

// 116. Populating Next Right Pointers in Each Node

public class PopulatingNextRightPointersInEachNode {
   public static void main(String[] args) {
      Solution3 s = new Solution3();
      // System.out.println(s.connect(arrayAsTree(new Integer[] { 1,2,3,4,5,6,7 })));
      System.out.println(s.connect(arrayAsTree(new Integer[] { -1,0,1,2,3,4,5,6,7,8,9,10,11,12,13 })));
      System.out.println(s.connect(arrayAsTree(new Integer[] {})));
   }

   private static Node arrayAsTree(Integer[] arr) {
      Node[] temp = new Node[arr.length];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == null)
            continue;
         else if (temp[i] == null)
            temp[i] = new Node(arr[i]);
         int left = (i << 1) + 1;
         int right = (i << 1) + 2;
         if (left < arr.length) {
            temp[left] = arr[left] != null ? new Node(arr[left]) : null;
            temp[i].left = temp[left];
         }
         if (right < arr.length) {
            temp[right] = arr[right] != null ? new Node(arr[right]) : null;
            temp[i].right = temp[right];
         }
      }
      return arr.length < 1 ? null : temp[0];
   }
}