/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem
Test cases : 10/10
*/

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    
    int total1=0;
    int total2=0;
    int size = arr.size();
    for(int i = 0; i < arr.size(); i++) {
        total1 += arr.get(i).get(i);
        total2 += arr.get(i).get(size-1-i);
    }
    
    return Math.abs((total1-total2));

    }

}