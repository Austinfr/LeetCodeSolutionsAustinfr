package Java;

import java.util.Arrays;

public class Problem88 {

    public Problem88(){
        new Solution().test();
    }

    public void p(Object o){
        System.out.println(o);
    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0, j = 0, k = (m + n - 1);
            while(i < m || j < n){
                if(i >= m){
                    nums1[k++] = nums2[j++];
                }else if(j >= n){
                    nums1[k++] = nums1[i++];
                }else{
                    nums1[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
                }
            }
            p(Arrays.toString(nums1));
        }

        public void test(){
            merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        }
    }
}