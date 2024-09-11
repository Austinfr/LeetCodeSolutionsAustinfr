package Java;

import java.util.Arrays;

public class Problem27 {
    
    public Problem27(){
        new Solution().test();
    }

    public void p(Object o){
        System.out.println(o);
    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[k++] = nums[i];
                }
            }
            p(Arrays.toString(nums));
            return k;
        }

        public void test(){
            p("Should return 2 " + removeElement(new int[]{3,2,2,3}, 3));
            p("Should return 5 " + removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        }
    }
}
