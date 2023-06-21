/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem
Test cases : 11/11
*/

class Result {

   /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    float positives = 0;
    float negatives = 0;
    float zeros = 0;
    int size = arr.size();
    
    for(int a : arr) {
        if(a<0) {
            negatives += 1;
        }
        else if(a>0) {
            positives += 1;
        }
        else {
            zeros += 1;
        }
    }
     
    System.out.printf("%.6f\n",positives/size);
    System.out.printf("%.6f\n",negatives/size);
    System.out.printf("%.6f\n",zeros/size);

    }

}

