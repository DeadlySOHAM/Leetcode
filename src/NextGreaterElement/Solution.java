package NextGreaterElement;

import java.util.*;

public class Solution {

   // try with array
   public int nextGreaterElement(int n) {
      if(n<=11) return -1;
      char[] digits = Integer.toString(n).toCharArray();
      PriorityQueue<Character> pq = new PriorityQueue<Character>();
      int i;
      for(i=digits.length-1; i>=1 && digits[i]<=digits[i-1]; i--) {
         pq.add(digits[i]);
      }
      if(i==0) return -1;
      int point = i-1;
      pq.add(digits[i]);
      boolean status = true;
      while(i<digits.length && !pq.isEmpty()){
         char digit = pq.poll();
         if(digit>digits[point] && status){
            status = false;
            pq.add(digits[point]);
            digits[point] = digit;
         } else
            digits[i++] = digit;
      }
      try {
         return Integer.parseInt(new String(digits));
      } catch(Exception e) {
         // e.printStackTrace();
         return -1;
      }
   }

   // fails for big numbers
   public int nextGreaterElement2(int n) {
      if(n<=11) return -1;
      int copy_n=n;
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      pq.add(copy_n%10);
      copy_n /= 10;
      int max = pq.peek();
      while(copy_n>0 && max<=copy_n%10) {
         pq.add(copy_n%10);
         max = copy_n%10;
         copy_n/=10;
      }
      if(copy_n==0) return -1;
      else {
         // swaping
         int digit = copy_n%10;
         copy_n /= 10;
         copy_n = (copy_n*10)+max;
         pq.add(digit);
         int s=pq.size();
         while(s-->1){
            copy_n = (copy_n*10)+pq.poll();
         }
         return copy_n;
      }
   }
}
