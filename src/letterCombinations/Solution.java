package letterCombinations;
//�绰�������ĸ���

import java.util.ArrayList;
import java.util.List;

/*
 * ����һ������������ 2-9 ���ַ����������������ܱ�ʾ����ĸ��ϡ�
�������ֵ���ĸ��ӳ�����£���绰������ͬ����ע�� 1 ����Ӧ�κ���ĸ��

ʾ��:
���룺"23"
�����["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
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
     * @param k digits�е�K���ַ�
     * @param digits��
     * @param list������
     * @param str������ַ���
     */
    public void getLetter(int k,String digit,List<String> list,String str) {
    	if(k >= digit.length()) {//�ݹ��������������������Ϊֹ��������ĸ��
    		list.add(str);//����ĸ������List
    		return ;//������һ����
    	}
    	int x = (int) (digit.charAt(k)-'0');//��char������תΪint��
//    	System.out.println(x);
    	//letters[x]��ʾ����Ϊx����ĸ��
    	for(int i=0;i<letters[x].length;i++) {//����ĸ����б���
    		
    		StringBuffer strbuf = new StringBuffer(str);//�����µ��ַ������ڱ�����ĸ��
    		strbuf.append(letters[x][i]);//����ǰ�ַ�������ĸ��
    		
    		getLetter(k+1,digit,list,strbuf.toString());//������һ�����������еݹ�
    		
    		
    		
    	}
    	return ;
    }
}