//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。 
//
// 示例 1: 
//
// 输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
// 
//
// 示例 2: 
//
// 输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
// 
// Related Topics 字符串 动态规划 
// 👍 922 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {//从左至右进行遍历
            if (s.charAt(i) == '(') {//左括号计数器
                left++;
            } else {
                right++;//右括号计数器
            }
            if (left == right) {//若 左括号数 == 右括号数 计算最大有效括号长度
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right > left) {//若 右括号 大于左括号 ，计数器 = 0
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {//从反向遍历，排除 ‘（（）’ 情况
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
