//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表 
// 👍 599 👎 0


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
    public ListNode swapPairs(ListNode head) {
        ListNode listhead = new ListNode(0);
        ListNode list = listhead;
        while(head != null){ //head isEmpty()
            if( head.next != null){  //head hasNext();
                ListNode node = head.next; //node --> head.next;
                list.next = node;               // list.next --> node;
                head.next = head.next.next;//head.next --> head.next.next
                node.next = head;
                head = head.next;
                list = list.next.next;
            }
            else {
                list.next = head;
                head = head.next;
            }
        }
        return listhead.next;
    }

}
//leetcode submit region end(Prohibit modification and deletion)