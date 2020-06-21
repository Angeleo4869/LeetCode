package intToRoman;
//����ת��������
class Solution {

	int[] roamnum = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
    	if(num==0) {
    		return "";
    	}
    	StringBuffer strbuf = new StringBuffer();
    	int i=0;
    	while(num>0) {
    		if(num>= roamnum[i]) {
    			strbuf.append(roman[i]);
    			num-=roamnum[i];
    		}else {
    			i++;
    		}
    	}
    	return strbuf.toString();
    }
}
/*
 * �������ְ������������ַ��� I�� V�� X�� L��C��D �� M��

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


����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

ʾ�� 1:

����: 3
���: "III"

ʾ�� 2:

����: 4
���: "IV"

ʾ�� 3:

����: 9
���: "IX"

ʾ�� 4:

����: 58
���: "LVIII"
����: L = 50, V = 5, III = 3.


ʾ�� 5:

����: 1994
���: "MCMXCIV"
����: M = 1000, CM = 900, XC = 90, IV = 4.

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/integer-to-roman
 */