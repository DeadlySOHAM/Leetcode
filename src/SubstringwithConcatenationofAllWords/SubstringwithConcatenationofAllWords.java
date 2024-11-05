package SubstringwithConcatenationofAllWords;

public class SubstringwithConcatenationofAllWords {
   public static void main(String[] args) {
      System.out.println(new Solution().findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
      System.out.println(new Solution().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
      System.out.println(new Solution().findSubstring("wordgoodgoodgoodbestwordword", new String[]{"word","good","best","word"}));
      System.out.println(new Solution().findSubstring("barfoofoobarthefoobarman", new String[]{"foo","bar","the"}));
      System.out.println(new Solution().findSubstring(getString(Math.pow(10,4)), getArr(5000)));
   }

   public static String getString(double range){
      String s = "";
      for(int i=0;i<range;i++){
         s+= "a";
      }
      return s;
   }

   public static String[] getArr(double range){
      String[] arr = new String[(int)range];
      for(int i=0;i<range;i++){
         arr[i] = "a";
      }
      return arr;
   }
}
