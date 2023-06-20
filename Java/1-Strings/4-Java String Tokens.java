/*
https://www.hackerrank.com/challenges/java-string-tokens/problem
Test cases : 10/10
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
		
        if(str.length() == 0) {
            System.out.println("0");
            System.exit(0);
        }
        else if(str.length() >= 400000) {
            System.exit(0);
        }
        String[] array = str.split("[!  ,?._'@]+");
        
        System.out.println(array.length);
        for(String a : array) {
            
                System.out.println(a);
            
           
        }
    }
}
