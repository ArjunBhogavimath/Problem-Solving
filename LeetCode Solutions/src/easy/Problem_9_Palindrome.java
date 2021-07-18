package easy;

public class Problem_9_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123;
		System.out.println(isPalindrome(num
				));

	}
	 public static boolean isPalindrome(int x) {
	        int reversed_int = 0;
	        if(x==0) return true;
	        
	        if(x<0 || x%10 ==0) return false;
	        
	        while(x>reversed_int){
	           int pop = x%10;
	            x/=10;
	            
	            reversed_int = (reversed_int*10) + pop;
	        }
	        if(x==reversed_int ||  x==reversed_int/10){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }

}
