/*
https://www.hackerrank.com/challenges/java-anagrams/problem
Test cases : 16/16
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
		
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
		
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
		
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
		
        if(Arrays.equals(s1Array, s2Array)){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
        
    }
}