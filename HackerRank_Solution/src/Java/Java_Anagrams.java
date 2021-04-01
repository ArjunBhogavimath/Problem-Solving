package Java;

/*
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Java_Anagrams {
	static boolean isAnagram(String a, String b) {
        // Complete the function
         a = a.toLowerCase();
         b = b.toLowerCase();
        
        if(a.length()!=b.length()) return false;
        
        Map<Character,Integer> map = new HashMap<>();
        
        for (int i =0;i<b.length();i++){
            char letter = b.charAt(i);
            
            if(!map.containsKey(letter)){
                map.put(letter,1);
            }
            else{
                Integer freq = map.get(letter);
                map.put(letter,++freq);
            }
            
        }
        
        for(int i=0;i<a.length();i++){
            char letter =a.charAt(i);
            
            if(!map.containsKey(letter)){
                return false;
            }
            Integer freq = map.get(letter);
            if(freq==0){
                return false;
            }
            else{
                map.put(letter,--freq);
            }
        }
     return true;   
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
