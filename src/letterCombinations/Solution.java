package letterCombinations;
//电话号码的字母组合

import java.util.ArrayList;
import java.util.List;

/*
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

示例:
输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 */

class Solution {
	char[][] letters = {{},{},{'a','b','c'},{'d','e','f'},//0 1,2,3
						{'g','h','i'},{ 'j','k','l'},{'m','n','o'},//4,5,6
						{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};//7,8,9
    public List<String> letterCombinations(String digits) {
    	
    	int k = 0;
    	List<String> list = new ArrayList<String>();
    	if(digits.length()<=0)
            return list;
    	getLetter(k,digits,list,"");
    	return list;
    }
    /**
     * 
     * @param k digits中第K个字符
     * @param digits串
     * @param list保存结果
     * @param str已求得字符串
     */
    public void getLetter(int k,String digit,List<String> list,String str) {
    	if(k >= digit.length()) {//递归结束条件，到最后个数字为止，返回字母串
    		list.add(str);//将字母串放入List
    		return ;//返回上一方法
    	}
    	int x = (int) (digit.charAt(k)-'0');//将char型数字转为int型
//    	System.out.println(x);
    	//letters[x]表示数字为x的字母表
    	for(int i=0;i<letters[x].length;i++) {//对字母表进行遍历
    		
    		StringBuffer strbuf = new StringBuffer(str);//定义新的字符串用于保存字母串
    		strbuf.append(letters[x][i]);//将当前字符放入字母串
    		
    		getLetter(k+1,digit,list,strbuf.toString());//进入下一级函数，进行递归
    		
    		
    		
    	}
    	return ;
    }
}