/*
https://www.hackerrank.com/challenges/java-list/problem
Test cases : 9/9
*/

public class Solution {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       List<Integer> myList = new ArrayList<>();
       for(int i=0;i<size;i++) {
           myList.add(sc.nextInt());
       }
       
       int queries = sc.nextInt();
       for(int j=0;j<queries;j++) {
           if(sc.next().equals("Insert")) {
               myList.add(sc.nextInt(),sc.nextInt());
           }
           else {
               myList.remove(sc.nextInt());
           }
       }
       
       for(int a : myList) {
           System.out.print(a + " ");
       }
       
    }
}
