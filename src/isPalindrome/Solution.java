package isPalindrome;
class Solution {
//	ͨ���ַ�����ת����
//    public boolean isPalindrome(int x) {
//    	StringBuffer str = (new StringBuffer(String.valueOf(x))).reverse();
//    	if(String.valueOf(x).equals(str.toString()))
//    	return true;
//    	else return false;
//    }
//    ��ͨ���ַ�������
    public boolean isPalindrome(int x) {
    	if(x < 0 ) return false;
    	if(x == 0) return true;
    	int y = x,z = 0;
    	while(y>0) {
    		z*=10;
    		z += y%10;
    		y/=10;
    	}
    	if(z == x)
    		return true;
    	return false;
    }
}