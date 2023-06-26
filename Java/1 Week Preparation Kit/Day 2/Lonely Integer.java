/*
https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem
Test cases : 8/8
*/

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    Collections.sort(a);
    
    Set mySet = new HashSet<>();
    
    if(a.size() == 1) {
        return a.get(0);
    }
    
    if(a.size() % 2 == 0) {
        return 0;
    }
    
    for(int i = 0; i < a.size(); i++) {
        int current = a.get(i);
        a.remove(i);
        if(!a.contains(current)) {
            return current;
        }
    }
    
    
    return 0;

    }

}