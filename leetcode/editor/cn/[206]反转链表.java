//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表 
// 👍 1188 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode listHead = new ListNode(0);
        listHead.next = head;
        while(head != null && head.next != null){
            ListNode node = head.next;
            head.next = head.next.next;
            node.next = listHead.next;
            listHead.next = node;
        }
        return listHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
