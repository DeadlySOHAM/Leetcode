package WildcardStringMatching;

class Solution {
   
   public boolean isMatch2(String s, String p) {
      boolean[][] table = new boolean[s.length()][p.length()];
      int i=0, j=0;
      while(i<s.length()&&j<=p.length()) {
         if(j<p.length())
            if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') {
               table[i++][j++] = true;
            } else if(p.charAt(j)=='*') {
               if(j+1>=p.length()) return true;
               while(i<s.length()-1 && p.charAt(j+1)!=s.charAt(++i));
               ++j;
            } else {
               break;
            }
         else
            while(j>0 && (p.charAt(--j)!=s.charAt(i) && p.charAt(j)!='?'));
         if(j==0) return false;
      }
      return table[table.length-1][table[table.length-1].length-1];
   }

   public boolean isMatch(String s, String p) {
      Boolean[][] memory = new Boolean[s.length()+1][p.length()+1];
      return isMatchRecurse(s, p, 0, 0, memory);
   }

   private boolean isMatchRecurse(String s, String p, int i, int j, Boolean[][] memory) {
      
      if(memory[i][j]!=null) return memory[i][j];
      Boolean result = null;

      if(i>=s.length() && j>=p.length()) result = true;
      else if(i>=s.length()) {
         if(j+1==p.length() || p.charAt(j)=='*') {
            int j_copy = j;
            while(++j_copy<p.length() && p.charAt(j_copy)=='*');
            j = j_copy-1;
            if(j==p.length()-1) result = p.charAt(j)=='*';
            else result = false;
         }
         else result = false;
      } else if(j>=p.length()) result = false;

      if(result!= null ) {
         memory[i][j] = result;
         return result;
      }

      if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') 
         result = isMatchRecurse(s, p, i+1, j+1, memory);
      else if(p.charAt(j)=='*') {
         if(j==p.length()-1) {
            memory[i][j] = true;
            return true;
         }
         int j_copy = j;
         while(++j_copy<p.length() && p.charAt(j_copy)=='*');
         j = j_copy-1;
         if(j==p.length()-1) {
            memory[i][j] = true;
            return true;
         }
         int i_copy = i;
         while(i_copy<s.length()) {
            if(s.charAt(i_copy)==p.charAt(j+1) || p.charAt(j+1)=='?')
               if(isMatchRecurse(s, p, i_copy, j+1, memory)){
                     memory[i][j]=true;
                     return true;
               }
               else ++i_copy;
            else ++i_copy;
         }
         memory[i][j] = false;
         return false;
      } else {
         memory[i][j] = false;
         return false;
      }
      
      memory[i][j] = result;
      return result;
   }

}