package stack;

import java.util.Stack;

public class Equal_Parenthesis {

	public static void main(String[] args) {
		String s = ")()())";
		Solution obj = new Solution();
		System.out.println(obj.longestValidParentheses(s));

	}

}
 class Solution {
    public int longestValidParentheses(String s) {
         if(s.length()<=1) return 0;
        Stack<Integer> stack = new Stack<>();
        char[] c = s.toCharArray();
        
        stack.push(-1);
        int answer =0;
        for(int i=0;i<s.length();i++){
            if(c[i]=='(')
                stack.push(i);
            else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }
                
                else{
                    answer = Math.max(answer, i-stack.peek());
                }
            }
        }
        return answer;
        
    }
}
//The basic idea of pushing the characters to the stack wont work here 
//so we need to push the index of the stack
//initially push -1 at first
//traverse through the char array
//check if the c[i] == ( then push the index
//otherwise pop the top most elemet from the stack
//then again check if the stack is empty if empty then push i
// otherwise take the max of the answer and i-top element of the stack