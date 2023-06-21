/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem
Test cases : 9/9
*/

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        
    if(s.contains("AM")) {
        if(s.startsWith("12")) {
             return s.replaceFirst("12", "00").substring(0,s.length()-2);
        }
        return s.substring(0,s.length()-2);
    }
    
    else {
        int first = Integer.parseInt(s.substring(0,2));
        if(first != 12) {
            first += 12;
        }
        String s1 = "";
        return s1.concat(String.valueOf(first)+s.substring(2,s.length()-2));
        
    }
    

    }

}