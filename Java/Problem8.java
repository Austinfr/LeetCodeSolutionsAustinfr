package Java;

public class Problem8 {
    
    public Problem8(){
        //tests as system out
        System.out.println("Given a string of \"42\" it should return 42 :: " + myAtoi("42"));
        System.out.println("Given a string of \" -042\" it should return -42 :: " + myAtoi(" -042"));
        System.out.println("Given a string of \"1337c0d3\" it should return 1337 :: " + myAtoi("1337c0d3"));
        System.out.println("Given a string of \"0-1\" it should return 0 :: " + myAtoi("0-1"));
        System.out.println("Given a string of \"words and 987\" it should return 0:: " + myAtoi("words and 987"));
    }

    //converts a string to a 32-bit signed integer
    public int myAtoi(String s) {
        //gets rid of white space
        s = s.trim();
        //if it's just an empty string or if it's a character that's not a minus sign
        if(s.length() == 0){
            return 0;
        }
        //checks if it's negative and if so stores a sign
        boolean isNegative = s.charAt(0) == '-';
        if(isNegative){
            s = s.substring(1, s.length());
        }

        //goes through each position of the string and when it stops being a number it returns the substring up to that point
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                s = s.substring(0, i);
                i = s.length();
            }
        }

        //if there was only characters and not numbers we return 0
        if(s == ""){
            return 0;
        }

        //this is incase the read number is out of the 32-bit Integer range
        try{
            return isNegative ? Integer.parseInt(s) * (-1) : Integer.parseInt(s);
        }catch(NumberFormatException nfe){
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
