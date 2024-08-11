package Java;

public class Problem9 {
    
    public Problem9(){

    }

    class Solution{
        public boolean isPalindrome(int x){
            String pal = "" + x;
            int l = pal.length();
            //checks if it's longer than 1 since it's always going to be a palindrome if it's just 1 digit
            if(l != 1){
                //for each character it checks if the character at the start and the end are the same and moves through the string
                for(int i = 0; i < l; i++){
                    if(pal.charAt(i) != pal.charAt(l - 1 - i)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    class secondSolution{
        public boolean isPalindrome(int x){
            //negative numbers aren't palindromes due to the '-' sign
            if(x < 0){
                return false;
            }
            //single digits are palindromes
            if(x < 10){
                return true;
            }
            
            return true;
        }
    }
}
