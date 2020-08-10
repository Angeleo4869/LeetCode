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
    	if(left + right == n*2) {//��������������ƥ��n��
    		list.add(str.toString());//����������������ϴ���list���������εݹ�
    		return ;
    	}
    	if(left < n) {//�����Ÿ�������n
    		addParentheses(str.append("("),left+1,right,n);
    		str.deleteCharAt(str.length()-1);//������һ������
    	}
    	if(left > right) {//�����Ÿ���С��������
    		addParentheses(str.append(")"),left,right+1,n);
    		str.deleteCharAt(str.length()-1);//������һ������
    	}
    }
}