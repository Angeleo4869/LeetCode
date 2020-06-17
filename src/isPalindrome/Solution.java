package isPalindrome;
public class Solution {
    public boolean isPalindrome(int x) {
    	StringBuffer str = (new StringBuffer(String.valueOf(x))).reverse();
    	if(String.valueOf(x).equals(str.toString()))
    	return true;
    	else return false;
    }
}