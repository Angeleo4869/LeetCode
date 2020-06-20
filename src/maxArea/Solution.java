package maxArea;
class Solution {
    public int maxArea(int[] height) {
    	int i=0,j = height.length-1;//����˫ָ�룬�ֱ�ָ������ͷ��β
    	int maxarea = 0;
    	while(i<j) {//ָ���غ������ѭ��
    		maxarea = Math.max(maxarea, Math.min(height[i],height[j])*(j-i));//���Ϊ������С������֮��
    		if(height[i]<=height[j]) {
    			i++;
    		}else j--;
    	}
    	return maxarea;
    }
}