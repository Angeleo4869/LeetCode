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
    	ListNode head = new ListNode();//����������ͷ��
    	ListNode list = head;//����һ��ָ�� list
        while(l1 != null && l2 != null) {//������������б�����ֱ������һ���������
        	if(l1.val < l2.val) {//�����ݽ�С��Ԫ������������
        		list.next = l1;
        		l1 = l1.next;
        	}else {
        		list.next = l2;
        		l2 = l2.next;
        	}
        	list = list.next;
        }
        /*
         * ���ϳ������ʣ�ಿ��������������β��
         */
        if(l1 != null) {
        	list.next = new ListNode(l1.val,l1.next);
        }
        if(l2 != null) {
        	list.next = new ListNode(l2.val,l2.next);
        }
        return head.next;//���������ͷ�����һ��Ԫ��
    }
}