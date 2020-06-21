package romanToInt;
//��������ת����
class Solution {
	
	int[] roamnum = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public int romanToInt(String s) {
    	if(s==null || "".equals(s))
    	return 0;
    	StringBuffer strbuf = new StringBuffer(s);
    	int i=0,sum = 0;
    	while(strbuf.length()>0) {
    		if(strbuf.toString().matches(roman[i]+".*")) {
    			strbuf.delete(0, roman[i].length());
    			sum+=roamnum[i];
    		}else {
    			i++;
    		}
    	}

    	return sum;
    }
}
/*
 * �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��

ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������


	I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
	X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
	C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��


����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/roman-to-integer
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
*/