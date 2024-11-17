package CountAndSay;

class Solution {
   public String countAndSay(int n) {
      if (n == 1) return "1";
      else {
         String s = countAndSay(n - 1);
         String result="";
         for(int i=0;i<s.length();){
            int count=0;
            while(i+count<s.length() && s.charAt(i+count)==s.charAt(i)){count++;}
            result += count+""+s.charAt(i);
            i+=count==0?1:count;
         }
         return result;
      }
   }
}