package SearchInRotatedSortedArray;

// 33

class SearchInRotatedSortedArray {
   public static void main(String[] args) {
      Solution s = new Solution();

      int i=0;

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},0)==0));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},0)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},0)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},0)==3));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},0)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},0)==1));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},1)==1));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},1)==0));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},1)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},1)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},1)==3));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},1)==2));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},2)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},2)==1));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},2)==0));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},2)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},2)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},2)==3));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},3)==3));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},3)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},3)==1));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},3)==0));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},3)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},3)==4));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},4)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},4)==3));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},4)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},4)==1));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},4)==0));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},4)==5));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,3,4,5},5)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{1,2,3,4,5,0},5)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{2,3,4,5,0,1},5)==3));
      System.out.println((i++)+" :: "+(s.search(new int[]{3,4,5,0,1,2},5)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,0,1,2,3},5)==1));
      System.out.println((i++)+" :: "+(s.search(new int[]{5,0,1,2,3,4},5)==0));

      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,6,7,0,1,2},0)==4));
      System.out.println((i++)+" :: "+(s.search(new int[]{4,5,6,7,0,1,2},3)==-1));

      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,4,5,6,7},3)==-1));
      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,4,5,6,7},6)==5));
      System.out.println((i++)+" :: "+(s.search(new int[]{0,1,2,4,5,6,7},1)==1));

      System.out.println((i++)+" :: "+(s.search(new int[]{7,0,1,2,4,5,6},3)==-1));
      System.out.println((i++)+" :: "+(s.search(new int[]{7,0,1,2,4,5,6},6)==6));
      System.out.println((i++)+" :: "+(s.search(new int[]{7,0,1,2,4,5,6},1)==2));
      System.out.println((i++)+" :: "+(s.search(new int[]{7,0,1,2,4,5,6},0)==1));

      System.out.println((i++)+" :: "+(s.search(new int[]{1},1)==0));

      System.out.println((i++)+" :: "+(s.search(new int[]{5,1,3},5)==0)); // false
      System.out.println((i++)+" :: "+(s.search(new int[]{5,6,1,3},1)==2));
   }
}