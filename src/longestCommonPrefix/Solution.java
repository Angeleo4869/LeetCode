package longestCommonPrefix;

//�����ǰ׺
//��дһ�������������ַ��������е������ǰ׺��
//��������ڹ���ǰ׺�����ؿ��ַ��� ""��
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0) {//�ų�strsΪ�յ����
    		return "";
    	}
    	Arrays.sort(strs,0,strs.length);//������ִ�����ǰ�棬�����ҳ����ǰ׺
    	StringBuffer str = new StringBuffer(strs[0]);//StringBuffer���޸ģ���Լ�ռ�
    	for(int i=0;i<strs.length;i++) {//�ӵ�0����ʼ
    		if("".equals(strs[i]))//����ַ���Ϊ����ֱ�ӷ���
    			return "";
//    		boolean startsWith(String prefix)���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
    		while(!strs[i].startsWith(str.toString())){
    			str.deleteCharAt(str.length()-1);//���������strΪǰ׺����str���һ���ַ�ɾ��
    		}
    	}
    	return str.toString();//����ǰcompare���ַ��ִ�
    }
}
