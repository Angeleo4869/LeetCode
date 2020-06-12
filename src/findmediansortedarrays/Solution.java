package findmediansortedarrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int a = nums1.length,b = nums2.length;
    	int[] nums = new int[a+b];
    	int k = 0;
    	int i= 0,j = 0;
    	while( i < a && j < b ) {//�� nums1�� nums2 ͬʱ����
    		nums[k++] = (nums1[i] <= nums2[j] ? nums1[i++]:nums2[j++]);
    	}
    	/*
    	 * ��ʣ��� nums1 �� nums2 Copy �� nums
    	 */
    	if( j == b ) while( i < a )
    		nums[k++] = nums1[i++];
    	else if( i == a )  while( j < b )
    		nums[k++] = nums2[j++];
    	if(k%2 == 0)
    		return (nums[k/2]+nums[k/2-1])/2.0;
    	return (nums[k/2])/1.0;
    }
}