package maxArea;
class Solution {
    public int maxArea(int[] height) {
    	int i=0,j = height.length-1;//定义双指针，分别指向数组头和尾
    	int maxarea = 0;
    	while(i<j) {//指针重合则结束循环
    		maxarea = Math.max(maxarea, Math.min(height[i],height[j])*(j-i));//面积为容器最小边与间隔之积
    		if(height[i]<=height[j]) {
    			i++;
    		}else j--;
    	}
    	return maxarea;
    }
}