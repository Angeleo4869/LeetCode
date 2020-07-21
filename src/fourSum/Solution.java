package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	
    	List<Integer> list;
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	if(nums == null || nums.length<4) {
    		return lists;
    	}
    	
    	Arrays.sort(nums);
    	int length = nums.length;
    	
    	for(int k=0;k<length-3;k++) {  //��һ��ѭ�����ӵ�һ�����ֿ�ʼ������
    		if(k>0 && nums[k] == nums[k-1]) {//�������һ����ͬ��������
    			continue;
    		}
    		int minsum = nums[k] + nums[k+1] + nums[k+2] + nums[k+3];//��ȡ��ǰ��Сֵ
    		if(minsum > target) break;//�����ǰ��СֵС��targetֱ�ӽ���
    		int maxsum = nums[k] + nums[length-1] + nums[length-2] + nums[length-3];//��ȡ��ǰ���ֵ
    		if(maxsum<target) continue;//�����ǰ���ֵ����targetֱ������
    		
    		for(int i=k+1;i<nums.length-2;i++) {//�ڶ���ѭ����ʼ
    			if(i>k+1 && nums[i] == nums[i-1]) {//�������һ����ͬ��������
        			continue;
        		}
//    			i��j��p����ָ��
    			int j = i+1;//ָ��i+1
    			int p = nums.length-1;//ָ�����һ��ֵ
    			
    			minsum = nums[k] + nums[i] + nums[j] + nums[j+1];//��ȡ��ǰ��Сֵ
        		if(minsum > target) break;//�����ǰ��СֵС��targetֱ�ӽ���
        		
        		maxsum = nums[k] + nums[i] + nums[p-1] + nums[p];//��ȡ��ǰ���ֵ
        		if(maxsum<target) continue;//�����ǰ���ֵ����targetֱ������
        		
        		while(j < p) {
        			        			
        			int tar = nums[k] + nums[i] + nums[j] + nums[p];
        			if(tar == target) {
        				list = new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j],nums[p]));
        				lists.add(list);
        				j++;
        				while(j<p && nums[j] == nums[j-1]) j++;
        				p--;
        				while(j<p && i<p && nums[p] == nums[p+1]) p--;
        			}else if(tar > target) {
        				p--;
        			}else j++;
        		}
        		
    		}
    		
    		
    	}
    		
    	return lists;
    }
}

