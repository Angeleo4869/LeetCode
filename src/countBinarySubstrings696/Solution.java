package countBinarySubstrings696;
class Solution {
    public int countBinarySubstrings(String s) {
    	int ans = 0,n = s.length();
    	if(s== null || "".equals(s))
    		return 0;
    	int a[] = new int[n];//统计连续相同字串的长度
    	a[0] = 1;
    	for(int i=1,j = 0;i<n;i++) {
    		if(s.charAt(i) == s.charAt(i-1)) {//两个字符相等
    			a[j] ++ ;
    		}else { //j 指向 下一个字串
    			a[++j] = 1;
    		}
    	}
    	for(int i=0;i<a.length-1;i++) {
    		if(a[i] == 0) {
    			break;
    		}
    		ans+= Math.min(a[i], a[i+1]);//取相邻长度最小值
    	}
    	return ans;
    }
}