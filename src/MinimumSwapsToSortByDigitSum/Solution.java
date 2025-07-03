package MinimumSwapsToSortByDigitSum;

import java.util.*;

class Solution {
    
    public int minSwaps(int[] nums) {
        Pair[] arr2 = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr2[i] = new Pair(nums[i], i, digitSum(nums[i]));
        Arrays.sort(arr2, Solution.this::compare);
        int i = 0, counter = 0;
        while (i < arr2.length) {
            if (arr2[i].second != i) {
                Pair temp = arr2[i];
                int indexCopy = arr2[i].second;
                arr2[i] = arr2[arr2[i].second];
                arr2[indexCopy] = temp;
                counter++;
            } else
                ++i;
        }
        return counter;
    }

    
    // method 2 - correct
    public int minSwaps2(int[] nums) {
        Pair[] arr2 = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr2[i] = new Pair(nums[i], i, digitSum(nums[i]));
        Arrays.sort(arr2, Solution.this::compare);
        int counter = 0;
        boolean[] visited = new boolean[nums.length];
        for(int i=0;i<visited.length;i++) {
            if(visited[i]==true || arr2[i].second == i) continue;
            int cycle = 0, j=i;
            while(!visited[j]) {
                visited[j] = true;
                j = arr2[j].second;
                cycle++;
            }
            if(cycle>1) counter += --cycle;
        }
        return counter;
    }


    private static final HashMap<Integer,Integer> record = new HashMap<Integer,Integer>();

    private int compare(Pair a, Pair b) {
        return a.third==b.third? Integer.compare(a.first, b.first) : Integer.compare(a.third, b.third);
    }

    private int digitSum(int a) {
        if(a<10) return a;
        else if(record.containsKey(a)) return record.get(a);
        int sum = 0, a_cp = a;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        record.put(a_cp,sum);
        return sum;
    }

    private static class Pair {
        public final int first, second, third;
        Pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
        public String toString() {
            return "{"+this.first+","+this.second+","+this.third+"}";
        }
    }

}