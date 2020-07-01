package threeSumClosest;
//最接近的三数之和
//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
//示例：
//输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
//提示：
//	3 <= nums.length <= 10^3
//	-10^3 <= nums[i] <= 10^3
//	-10^4 <= target <= 10^4
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/3sum-closest
import java.util.Arrays;

//暴力法
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	int n = nums.length;
    	int flag = target;
    	int targe = Integer.MAX_VALUE;//三数之和与target的差距
        Arrays.sort(nums);
        for (int i = 0; i < n; ++i) {
        	if(i>0 && nums[i] == nums[i-1]) {//如果与上一个重复直接跳过
        		continue;
        	}
            // c 对应的指针初始指向数组的最右端
            int k = n - 1;
            // 枚举 b
            for (int j = i + 1; j < n; ++j) {
            	if(j>i+1 && nums[j] == nums[j-1]) {//如果与上一个重复直接跳过
            		continue;
            	}
            	// 需要保证 b 的指针在 c 的指针的左侧
                while (j < k ) {
//                  判断三个数之和与target的差
                	int x = nums[i]+nums[j]+nums[k];
                    int y = (int) Math.abs(x - target);
                    if( y < targe) {
                    	targe = y;
                    	flag = x;
                    }
                    --k;
                }
                // 如果指针重合，直接退出循环
                if (j == k) {
                    break;
                }
            }
        }
        return flag;
    }
}