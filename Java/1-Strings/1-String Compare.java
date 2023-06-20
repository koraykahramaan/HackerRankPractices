/*
https://www.hackerrank.com/challenges/java-string-compare/problem
Test cases : 6/6
*/

// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'

public static String getSmallestAndLargest(String s, int k) {
        String a = s.substring(0,k);
        String smallest = a;
        String largest = a;
        
        for(int i = 1;i<=s.length()-k;i++) {
            String b = s.substring(i,(i+k));
            if(b.compareTo(smallest) < 0) {
                smallest = b;
            }
            if(b.compareTo(largest) > 0) {
                largest = b;
            }
        }
        
        
        return smallest + "\n" + largest;
    }