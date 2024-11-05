package Sum3;

import java.util.*;

class Solution {

   public List<List<Integer>> threeSum(int[] nums) {

      List<List<Integer>> ans = new ArrayList<List<Integer>>();
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

      for (int i = 0; i < nums.length; i++) {
         if (map.get(nums[i]) == null) {
            map.put(nums[i], 1);
         } else
            map.put(nums[i],map.get(nums[i])+1);
      }


      System.out.println(map.keySet());

      for(Iterator<Integer> i=map.keySet().iterator();i.hasNext();){
         int a = i.next();
         System.out.println("A : "+a);
         if(a==0 && map.get(a)>2){
            ans.add(Arrays.asList(a,a,a));
            if (i.hasNext()) a = i.next();
            else return ans;
         }
         List<Integer> tempb = new ArrayList<Integer>();
         for(Iterator<Integer> j=map.keySet().iterator();j.hasNext();){
            int b=j.next();
            if(b==a)
               if(j.hasNext()){ b=j.next();}else{ break;}
            int c = -(a+b);
            System.out.println("\t"+tempb);
            System.out.print("\tB : "+b+"\tC : "+c);
            if(map.containsKey(c)&& !tempb.contains(c)){
               if(c==a&&b==a&&map.get(a)>2){}
               else if((c==a && map.get(a)>1) || (c==b && map.get(b)>1) || (c!=a && c!=b)){
                  ans.add(Arrays.asList(a,b,c));
                  tempb.add(b);
                  System.out.print("\tUsed");
               }
            }
            System.out.println("");
         }
         tempb = null;
         i.remove();
      }


      return ans;
   }

}