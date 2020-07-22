package mergeTwoLists;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){ this.val = val;}
	ListNode(int val, ListNode next){ this.val = val; this.next = next;}
	
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode();//定义新链表头部
    	ListNode list = head;//定义一个指针 list
        while(l1 != null && l2 != null) {//对两个链表进行遍历，直至其中一个遍历完毕
        	if(l1.val < l2.val) {//将数据较小的元素置入新链表
        		list.next = l1;
        		l1 = l1.next;
        	}else {
        		list.next = l2;
        		l2 = l2.next;
        	}
        	list = list.next;
        }
        /*
         * 将较长链表的剩余部份连接至新链表尾部
         */
        if(l1 != null) {
        	list.next = new ListNode(l1.val,l1.next);
        }
        if(l2 != null) {
        	list.next = new ListNode(l2.val,l2.next);
        }
        return head.next;//返回链表除头部外第一个元素
    }
}