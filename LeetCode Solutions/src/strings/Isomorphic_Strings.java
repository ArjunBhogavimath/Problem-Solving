package strings;

import java.util.Scanner;
import java.util.*;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		System.out.println(isIsomorphic(s,t));
		

	}
	public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(map1.containsKey(c1)==true){
                if(map1.get(c1)!=c2){
                    return false;
                }
            }else{
               if( map2.containsKey(c2)== true){
                   return false;
               }
                else{
                    map1.put(c1,c2);
                    map2.put(c2,true);
                }
            }
        }
        return true;
        
        
    }

}
