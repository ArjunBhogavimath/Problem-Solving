package maths;
//7. Reverse Integer


public class Reverse_Int {

	public static void main(String[] args) {
		Solution s = new Solution();
		int ans =s.reverse(321);
		System.out.println(ans);

	}

}
class Solution {
    public int reverse(int x) {
        int reverse = 0 ;
        int mod =0;
        while(x!=0){
            mod = x%10;
            x/=10;
            
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && mod>7) return 0;
            if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && mod<-8) return 0;
            
            reverse = (reverse*10)+mod;
        }
        return reverse;
    }
}
//At first take the modulos (remainder) whihc will be the last elememt of the number.
// and then store the value in mod
// and then divide the x by 10 to continue
