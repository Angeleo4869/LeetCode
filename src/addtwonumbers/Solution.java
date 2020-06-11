package addtwonumbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	
	int x,y = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   
    	
    	if(l1 == null && l2 == null) {//�ڵ�Ϊ�� ֱ�ӷ���null
    		if(y!=0)
    			return new ListNode(y);
    		return null;
    	}

    	x = ((l1==null?0:l1.val) + (l2==null?0:l2.val) + y);//����ڵ�֮��
    	ListNode head = new ListNode(x%10);//����λ�����µ�����
    	y = x/10;//ȡ��λ
    	head.next= addTwoNumbers((l1==null?null:l1.next),(l2==null?null:l2.next));
    	return head;

    }
}