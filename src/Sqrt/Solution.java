package Sqrt;

class Solution {
   public int mySqrt(int x) {
      if(x==0||x==1) return x;
      else if(x<=3) return 1;
      else if(x<=8) return 2;
 
      int l=0,u=(x/2)+1;
      int mid = (l+x)/2;
      int ans=0;

      while(l<=u) {
         mid=(l+u)/2;
         long square = (long)mid*(long)mid;
         if(square==x) return mid;
         else if(square>x) u=mid-1;
         else {
            l = mid+1;
            ans = mid;
         }
      }
      return ans;
   }
}