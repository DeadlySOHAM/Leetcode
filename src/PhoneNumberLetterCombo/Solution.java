package PhoneNumberLetterCombo;
import java.util.*;

public class Solution {

   private static final HashMap<Character,ArrayList<String>> numberMap = new HashMap<Character,ArrayList<String>>(8){{
      put('2',(new ArrayList<String>( Arrays.asList(new String[]{"a","b","c"}))));
      put('3',(new ArrayList<String>( Arrays.asList(new String[]{"d","e","f"}))));
      put('4',(new ArrayList<String>( Arrays.asList(new String[]{"g","h","i"}))));
      put('5',(new ArrayList<String>( Arrays.asList(new String[]{"j","k","l"}))));
      put('6',(new ArrayList<String>( Arrays.asList(new String[]{"m","n","o"}))));
      put('7',(new ArrayList<String>( Arrays.asList(new String[]{"p","q","r","s"}))));
      put('8',(new ArrayList<String>( Arrays.asList(new String[]{"t","u","v"}))));
      put('9',(new ArrayList<String>( Arrays.asList(new String[]{"w","x","y","z"}))));
   }};

   public List<String> letterCombinations(String digits) {
      ArrayList<String> result = new ArrayList<String>();
      for(int i=0;i<digits.length();i++){
         ArrayList<String> chars = numberMap.get(digits.charAt(i));
         if(result.size()==0)
            result.addAll(chars);
         else {
            int limit = result.size();
            for(int j=limit-1;j>=0;j--){
               for(String ch:chars){
                  result.add(result.get(j)+ch);
               }
               result.remove(j);
            }
         }
      }
      return result;
   }
}
