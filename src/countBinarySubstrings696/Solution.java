package countBinarySubstrings696;
class Solution {
    public int countBinarySubstrings(String s) {
    	int ans = 0,n = s.length();
    	if(s== null || "".equals(s))
    		return 0;
    	int a[] = new int[n];//ͳ��������ͬ�ִ��ĳ���
    	a[0] = 1;
    	for(int i=1,j = 0;i<n;i++) {
    		if(s.charAt(i) == s.charAt(i-1)) {//�����ַ����
    			a[j] ++ ;
    		}else { //j ָ�� ��һ���ִ�
    			a[++j] = 1;
    		}
    	}
    	for(int i=0;i<a.length-1;i++) {
    		if(a[i] == 0) {
    			break;
    		}
    		ans+= Math.min(a[i], a[i+1]);//ȡ���ڳ�����Сֵ
    	}
    	return ans;
    }
}