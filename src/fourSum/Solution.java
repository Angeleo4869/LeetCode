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
    	
    	for(int k=0;k<length-3;k++) {  //第一重循环，从第一个数字开始向后遍历
    		if(k>0 && nums[k] == nums[k-1]) {//如果与上一个相同，则跳过
    			continue;
    		}
    		int minsum = nums[k] + nums[k+1] + nums[k+2] + nums[k+3];//获取当前最小值
    		if(minsum > target) break;//如果当前最小值小于target直接结束
    		int maxsum = nums[k] + nums[length-1] + nums[length-2] + nums[length-3];//获取当前最大值
    		if(maxsum<target) continue;//如果当前最大值大于target直接跳过
    		
    		for(int i=k+1;i<nums.length-2;i++) {//第二层循环开始
    			if(i>k+1 && nums[i] == nums[i-1]) {//如果与上一个相同，则跳过
        			continue;
        		}
//    			i，j，p三个指针
    			int j = i+1;//指向i+1
    			int p = nums.length-1;//指向最后一个值
    			
    			minsum = nums[k] + nums[i] + nums[j] + nums[j+1];//获取当前最小值
        		if(minsum > target) break;//如果当前最小值小于target直接结束
        		
        		maxsum = nums[k] + nums[i] + nums[p-1] + nums[p];//获取当前最大值
        		if(maxsum<target) continue;//如果当前最大值大于target直接跳过
        		
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

