package Java;

public class Problem9 {
    
    public Problem9(){
        test(new Solution());
        test(new secondSolution());
    }

    public void pl(Object o){
        System.out.println(o);
    }

    public void test(solve s){
        pl("Should print out true for 2::" + s.isPalindrome(2));
        pl("Should print out false for -121::" + s.isPalindrome(-121));
        pl("Should print out true for 202::" + s.isPalindrome(202));
    }

    //so the tests can be changed above and run on either solution properly
    abstract class solve{
        public abstract boolean isPalindrome(int x);
    }
    class Solution extends solve{
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

    class secondSolution extends solve{
        public boolean isPalindrome(int x){
            //negative numbers aren't palindromes due to the '-' sign
            if(x < 0){
                return false;
            }
            //single digits are palindromes
            if(x < 10){
                return true;
            }

            long temp = 0;
            //stores x to check later and get's each digit sequentially adding then moving over
            int store = x;
            while(x != 0){
                temp += x % 10;
                if((x = x / 10) != 0){
                    temp *= 10;
                }
            }

            return store == temp;
            
        }
    }
}
