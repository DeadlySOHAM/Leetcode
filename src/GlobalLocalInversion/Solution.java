package GlobalLocalInversion;

public class Solution {

   private int globalCount = 0, localCount = 0;
   
   public boolean isIdealPermutation(int[] nums) {
      this.globalCount =0;
      this.localCount = 0;
      mergeSort(nums);
      // System.out.println("GC : "+this.globalCount);
      // System.out.println("LC : "+this.localCount);
      return this.globalCount == this.localCount;
   }

   public int[] mergeSort(int[] num){
      if(num.length == 1) return num;
      else {
         int mid = num.length/2;
         int[] left = new int[mid], right = new int[num.length%2==0?mid:mid+1];
         for(int i=0;i<mid;i++){
            left[i] = num[i];
            right[i] = num[mid+i];
         }
         if(num.length%2!=0)
            right[right.length-1] = num[num.length-1];

         if(left.length == 1 && right.length <=2 && left[0]>right[0]){
            this.localCount++;
         }
         
         left = mergeSort(left);
         right = mergeSort(right);


         int l=0, r=0, i=0;

         while (l<left.length && r<right.length) {
            if(left[l]<right[r])
               num[i++] = left[l++];
            else if(right[r]<left[l]){
               num[i++] = right[r++];
               this.globalCount+=left.length-l;
            }
            else {
               num[i++] = left[l++];
            }
         }
         if(l<left.length) num[i++] = left[l++];
         while(l<left.length){
            num[i++] = left[l++];
         }
         while(r<right.length){
            num[i++] = right[r++];
         }

         return num;
      }
   }
}
