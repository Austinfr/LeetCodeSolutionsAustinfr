package Java;

public class Problem14 {

    public Problem14(){
        new Solution().test();
    }
    
    public void pl(Object o){
        System.out.println(o);
    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix = "";
            String tempPrefix = "";
            for(int j = 0; j < strs[0].length(); j++){
                tempPrefix = strs[0].substring(0, j + 1);
                for(int i = 1; i < strs.length; i++){
                    if(!strs[i].substring(0, j+1).equals(tempPrefix)){
                        return prefix;
                    }
                }
                prefix = tempPrefix;
            }
    
            return prefix;
        }

        public void test(){
            pl("On the array [\"flower\",\"flow\",\"flight\"] it should return \"fl\"::" + longestCommonPrefix(new String[]{"flower","flow","flight"}));
            pl("On the array [\"dog\",\"racecar\",\"car\"] it should return \"\"::" + longestCommonPrefix(new String[]{"dog","racecar","car"}));
        }
    }
}
