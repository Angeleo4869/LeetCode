package generateParenthesis;

import java.util.ArrayList;
import java.util.List;

class Solution {
	List<String> list = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        addParentheses(new StringBuffer(),0,0,n);
        return list;
    }
    
    public void addParentheses(StringBuffer str,int left,int right,int n) {
    	if(left + right == n*2) {//左括号与右括号匹配n对
    		list.add(str.toString());//符合条件的括号组合存入list，结束本次递归
    		return ;
    	}
    	if(left < n) {//左括号个数少于n
    		addParentheses(str.append("("),left+1,right,n);
    		str.deleteCharAt(str.length()-1);//回溯上一级括号
    	}
    	if(left > right) {//右括号个数小于左括号
    		addParentheses(str.append(")"),left,right+1,n);
    		str.deleteCharAt(str.length()-1);//回溯上一级括号
    	}
    }
}