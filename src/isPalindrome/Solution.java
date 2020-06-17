package isPalindrome;
class Solution {
//	通过字符串反转计算
//    public boolean isPalindrome(int x) {
//    	StringBuffer str = (new StringBuffer(String.valueOf(x))).reverse();
//    	if(String.valueOf(x).equals(str.toString()))
//    	return true;
//    	else return false;
//    }
//    不通过字符串计算
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