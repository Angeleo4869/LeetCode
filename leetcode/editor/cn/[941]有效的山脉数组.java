//给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。 
//
// 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组： 
//
// 
// A.length >= 3 
// 在 0 < i < A.length - 1 条件下，存在 i 使得：
// 
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
// 
// 
// 
//
// 
//
// 
//
// 
//
// 示例 1： 
//
// 输入：[2,1]
//输出：false
// 
//
// 示例 2： 
//
// 输入：[3,5,5]
//输出：false
// 
//
// 示例 3： 
//
// 输入：[0,3,2,1]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
//
// 
// Related Topics 数组 
// 👍 114 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        int x, y;
        for(x = 0;x < A.length -1 ;x++){
            if(A[x] >= A[x+1]) break;
        }
        for(y = A.length-1 ; y > 1;y--){
            if(A[y] >= A[y-1]) break;
        }
        if((x > 0 && y < A.length-1) && x == y)  return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
