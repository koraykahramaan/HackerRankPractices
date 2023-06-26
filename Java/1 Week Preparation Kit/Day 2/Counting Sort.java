/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem
Test cases : 5/5
*/

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        
    List<Integer> freqList = new ArrayList<Integer>(Collections.nCopies(100, 0));    
    
    for(int i = 0;i<arr.size();i++) {
        freqList.set(arr.get(i),freqList.get(arr.get(i))+1);
    }
    return freqList;
    }

}
