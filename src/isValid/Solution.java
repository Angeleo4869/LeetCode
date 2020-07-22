package isValid;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    	char[] chars = s.toCharArray();//将字符串转化为字符数组
    	Stack<Character> stack = new Stack<Character>();//创建一个栈对象
    	for(int i=0;i<chars.length;i++) {//对字符串进行一次遍历
    		switch(chars[i]) {
    		/*
    		 * 如果是左括号，入栈
    		 */
    		case '(':stack.push(chars[i]);break;
    		case '[':stack.push(chars[i]);break;
    		case '{':stack.push(chars[i]);break;
    		/*
    		 * 如果是右括号，判断当前栈顶元素是否与当前元素匹配
    		 * 若匹配，当前栈顶元素出栈
    		 * 若不匹配，当前元素入栈
    		 */
    		case ')':if(!stack.isEmpty() &&stack.peek() == '(')stack.pop();
    		else stack.push(chars[i]);break;
    		case ']':if(!stack.isEmpty() &&stack.peek() == '[')stack.pop();
    		else stack.push(chars[i]);break;
    		case '}':if(!stack.isEmpty() &&stack.peek() == '{')stack.pop();
    		else stack.push(chars[i]);break;
    		}
    	}
    	//如果栈为空，则全部匹配成功
    	if(stack.isEmpty()) {
    		return true;
    	}
    	return false;

    }
}