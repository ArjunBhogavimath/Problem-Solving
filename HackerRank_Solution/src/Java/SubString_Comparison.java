package Java;
import java.util.Scanner;
/*
 * We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .
 */

public class SubString_Comparison {
	 public static String getSmallestAndLargest(String s, int k) {
	        //create a new substring with the length of the k 
	        String current_subString = s.substring(0,k);
	        String smallest = current_subString;
	        String largest = current_subString;
	        
	       for(int i=1;i<s.length()-k;i++){
	           current_subString  = s.substring(i,i+k);
	           
	           if(current_subString.compareTo(largest)>0){
	               largest = current_subString;
	           }
	           
	            if(current_subString.compareTo(smallest)<0){
	               smallest = current_subString;
	           }
	       }
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
