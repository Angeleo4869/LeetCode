package longestPalindrome;

class Solution {
	//马拉车算法
    public String longestPalindrome(String s) {
    	
    	    if (s.length() < 2) {
    	        return s;
    	    }
    	    // 第一步：预处理，将原字符串转换为新字符串
    	    StringBuffer t = new StringBuffer("$");
    	    for (int i=0; i<s.length(); i++) {
    	        t.append("#").append(s.charAt(i));
    	    }
    	    // 尾部再加上字符@，变为奇数长度字符串
    	    t.append("#@");
    	    // 第二步：计算数组p、起始索引、最长回文半径
    	    int n = t.length();
    	    // p数组
    	    int[] p = new int[n];
    	    int id = 0, mx = 0;
    	    // 最长回文子串的长度
    	    int maxLength = -1;
    	    // 最长回文子串的中心位置索引
    	    int index = 0;
    	    for (int j=1; j<n-1; j++) {
    	        p[j] = mx > j ? Math.min(p[2*id-j], mx-j) : 1;
    	        // 向左右两边延伸，扩展右边界
    	        while (t.charAt(j+p[j]) == t.charAt(j-p[j])) {
    	            p[j]++;
    	        }
    	        // 如果回文子串的右边界超过了mx，则需要更新mx和id的值
    	        if (mx < p[j] + j) {
    	            mx = p[j] + j;
    	            id = j;
    	        }
    	        // 如果回文子串的长度大于maxLength，则更新maxLength和index的值
    	        if (maxLength < p[j] - 1) {
    	            maxLength = p[j] - 1;
    	            index = j;
    	        }
    	    }
    	    // 第三步：截取字符串，输出结果
    	    // 最长回文子串的起始索引int index = (i - p[i])/2。
    	    int start = (index-maxLength)/2;
    	    return s.substring(start, start + maxLength);
    	}
}