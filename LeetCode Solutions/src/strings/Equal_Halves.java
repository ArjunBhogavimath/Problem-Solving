package strings;

public class Equal_Halves {
	 public boolean halvesAreAlike(String s) {
	        s = s.toLowerCase();
	        int len = s.length();
	        int mid = len/2;
	        
	        int count =0;
	        char[] c = s.toCharArray();
	        for(int i=0;i<mid;i++){
	            if(c[i] == 'a' || c[i] == 'e' || c[i] =='i' || c[i] =='o' || c[i] =='u'){
	                count++;
	            }
	        }
	        for(int i =mid;i<len;i++){
	             if(c[i] == 'a' || c[i] == 'e' || c[i] =='i' || c[i] =='o' || c[i] =='u'){
	                count--;
	            }
	        }
	        if(count == 0) return true;
	        else return false;
	    }

}
