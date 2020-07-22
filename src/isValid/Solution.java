package isValid;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    	char[] chars = s.toCharArray();//���ַ���ת��Ϊ�ַ�����
    	Stack<Character> stack = new Stack<Character>();//����һ��ջ����
    	for(int i=0;i<chars.length;i++) {//���ַ�������һ�α���
    		switch(chars[i]) {
    		/*
    		 * ����������ţ���ջ
    		 */
    		case '(':stack.push(chars[i]);break;
    		case '[':stack.push(chars[i]);break;
    		case '{':stack.push(chars[i]);break;
    		/*
    		 * ����������ţ��жϵ�ǰջ��Ԫ���Ƿ��뵱ǰԪ��ƥ��
    		 * ��ƥ�䣬��ǰջ��Ԫ�س�ջ
    		 * ����ƥ�䣬��ǰԪ����ջ
    		 */
    		case ')':if(!stack.isEmpty() &&stack.peek() == '(')stack.pop();
    		else stack.push(chars[i]);break;
    		case ']':if(!stack.isEmpty() &&stack.peek() == '[')stack.pop();
    		else stack.push(chars[i]);break;
    		case '}':if(!stack.isEmpty() &&stack.peek() == '{')stack.pop();
    		else stack.push(chars[i]);break;
    		}
    	}
    	//���ջΪ�գ���ȫ��ƥ��ɹ�
    	if(stack.isEmpty()) {
    		return true;
    	}
    	return false;

    }
}