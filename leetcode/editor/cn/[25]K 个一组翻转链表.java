//给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。 
//
// k 是一个正整数，它的值小于或等于链表的长度。 
//
// 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。 
//
// 
//
// 示例： 
//
// 给你这个链表：1->2->3->4->5 
//
// 当 k = 2 时，应当返回: 2->1->4->3->5 
//
// 当 k = 3 时，应当返回: 3->2->1->4->5 
//
// 
//
// 说明： 
//
// 
// 你的算法只能使用常数的额外空间。 
// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。 
// 
// Related Topics 链表 
// 👍 701 👎 0


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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode list = head;
        for(int i=0;i<k;i++){
            if(list == null){
                return head;
            }
            list = list.next;
        }

        ListNode listHead = reverseKGroup(list,k);//listHead指向下一个链表的头
        list = head;//list指向当前链表头
        int x = k;
        while(x-- > 0){//k个数进行翻转
            ListNode node = list.next; //node指向list下一个元素
            list.next = listHead;  // list指向下一个链表，既将当前节点至于尾部
            listHead = list;//listHead向上移一位
            list = node;//list指向下一个元素
        }
        return listHead;//返回当前链表头
    }
}
//leetcode submit region end(Prohibit modification and deletion)

