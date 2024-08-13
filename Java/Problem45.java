package Java;
public class Problem45 {

    //shorthand for sys.out.println
    public void pl(Object o){
        System.out.println(o);
    }

    public Problem45(){

        class Solution {
            // You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

            // Each element nums[i] represents the maximum length of a forward jump from index i. 
            // In other words, if you are at nums[i], you can jump to any nums[i + j] where:
            // 0 <= j <= nums[i] and i + j < n
            // Return the minimum number of jumps to reach nums[n - 1]. 
            // The test cases are generated such that you can reach nums[n - 1].

            // Constraints:

            // 1 <= nums.length <= 104
            // 0 <= nums[i] <= 1000
            // It's guaranteed that you can reach nums[n - 1].

            public int jump(int[] nums) {
                int jumps = nums.length;
                for(int i = 0; i < nums.length; i++){
                    int count = i;
                    int j = i + nums[i];
                    while(j < nums.length && j != 0){
                        count++;
                        j += (nums[j] == 0 ? 1: nums[j]);
                    }
                    if(count < jumps){
                        pl(count);
                        jumps = count;
                    }
                }
                pl("jumps:" + jumps);
                return jumps;
            }

            public void test(){
                pl("test 1 passes:" + (2 == jump(new int[]{2,3,1,1,4})));
                pl("test 2 passes:" + (2 == jump(new int[]{2,3,0,1,4})));
                pl("test 3 passes:" + (1 == jump(new int[]{1,2})));
            }

        }

        new Solution().test();
    }
}
