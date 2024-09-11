package Java;

public class Problem26 {
    
    public Problem26(){
        new Solution().test();
    }

    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0;
            for(int i = 0; i < nums.length; i++){
                //need to condition something
                if(true){
                    nums[k++] = nums[i];
                }
            }

            return k;
        }

        public test(){

        }
    }
}
