package threeSumClosest;
//��ӽ�������֮��
//����һ������ n ������������ nums �� һ��Ŀ��ֵ target���ҳ� nums �е�����������ʹ�����ǵĺ��� target ��ӽ����������������ĺ͡��ٶ�ÿ������ֻ����Ψһ�𰸡�
//ʾ����
//���룺nums = [-1,2,1,-4], target = 1
//�����2
//���ͣ��� target ��ӽ��ĺ��� 2 (-1 + 2 + 1 = 2) ��
//��ʾ��
//	3 <= nums.length <= 10^3
//	-10^3 <= nums[i] <= 10^3
//	-10^4 <= target <= 10^4
//��Դ�����ۣ�LeetCode��
//���ӣ�https://leetcode-cn.com/problems/3sum-closest
import java.util.Arrays;

//������
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	int n = nums.length;
    	int flag = target;
    	int targe = Integer.MAX_VALUE;//����֮����target�Ĳ��
        Arrays.sort(nums);
        for (int i = 0; i < n; ++i) {
        	if(i>0 && nums[i] == nums[i-1]) {//�������һ���ظ�ֱ������
        		continue;
        	}
            // c ��Ӧ��ָ���ʼָ����������Ҷ�
            int k = n - 1;
            // ö�� b
            for (int j = i + 1; j < n; ++j) {
            	if(j>i+1 && nums[j] == nums[j-1]) {//�������һ���ظ�ֱ������
            		continue;
            	}
            	// ��Ҫ��֤ b ��ָ���� c ��ָ������
                while (j < k ) {
//                  �ж�������֮����target�Ĳ�
                	int x = nums[i]+nums[j]+nums[k];
                    int y = (int) Math.abs(x - target);
                    if( y < targe) {
                    	targe = y;
                    	flag = x;
                    }
                    --k;
                }
                // ���ָ���غϣ�ֱ���˳�ѭ��
                if (j == k) {
                    break;
                }
            }
        }
        return flag;
    }
}