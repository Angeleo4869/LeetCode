package reverse;
class Solution {
    public int reverse(int x) {    	    	
	long num = 0;
	while(Math.abs(x)>0) {
		num*=10;
		num+=(x%10);    		
		x/=10;
	}
	if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {//判断新生成的数是否超限
		return 0;
	}
	return (int)num;
}
}