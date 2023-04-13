import java.util.*;
class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
    }
    public void main(){
  String s="(())()((()))";
      if( isValid(s) )
      System.out.print("Valid Parentheses");
      else
      System.out.print("Not Valid Parentheses");
}}