package longestPalindrome;

class Solution {
	//�������㷨
    public String longestPalindrome(String s) {
    	
    	    if (s.length() < 2) {
    	        return s;
    	    }
    	    // ��һ����Ԥ������ԭ�ַ���ת��Ϊ���ַ���
    	    StringBuffer t = new StringBuffer("$");
    	    for (int i=0; i<s.length(); i++) {
    	        t.append("#").append(s.charAt(i));
    	    }
    	    // β���ټ����ַ�@����Ϊ���������ַ���
    	    t.append("#@");
    	    // �ڶ�������������p����ʼ����������İ뾶
    	    int n = t.length();
    	    // p����
    	    int[] p = new int[n];
    	    int id = 0, mx = 0;
    	    // ������Ӵ��ĳ���
    	    int maxLength = -1;
    	    // ������Ӵ�������λ������
    	    int index = 0;
    	    for (int j=1; j<n-1; j++) {
    	        // �ο�ǰ�ĵ��岿��
    	        p[j] = mx > j ? Math.min(p[2*id-j], mx-j) : 1;
    	        // �������������죬��չ�ұ߽�
    	        while (t.charAt(j+p[j]) == t.charAt(j-p[j])) {
    	            p[j]++;
    	        }
    	        // ��������Ӵ����ұ߽糬����mx������Ҫ����mx��id��ֵ
    	        if (mx < p[j] + j) {
    	            mx = p[j] + j;
    	            id = j;
    	        }
    	        // ��������Ӵ��ĳ��ȴ���maxLength�������maxLength��index��ֵ
    	        if (maxLength < p[j] - 1) {
    	            // �ο�ǰ�ĵ�������
    	            maxLength = p[j] - 1;
    	            index = j;
    	        }
    	    }
    	    // ����������ȡ�ַ�����������
    	    // ������Ӵ�����ʼ����int index = (i - p[i])/2��
    	    int start = (index-maxLength)/2;
    	    return s.substring(start, start + maxLength);
    	}
}