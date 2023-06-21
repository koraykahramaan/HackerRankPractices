/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem
Test cases : 14/14
*/

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
    Collections.sort(arr);
    long min = 0;
    long max = 0;
    for(int i = 0;i<arr.size()-1;i++) {
         min += arr.get(i);
         max += arr.get(arr.size()-(i+1));
    }
    
    System.out.println(min + " " + max);
    
    

    }

}