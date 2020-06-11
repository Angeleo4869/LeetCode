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
    	
    	if(l1 == null && l2 == null) {//节点为空 直接返回null
    		if(y!=0)
    			return new ListNode(y);
    		return null;
    	}

    	x = ((l1==null?0:l1.val) + (l2==null?0:l2.val) + y);//计算节点之和
    	ListNode head = new ListNode(x%10);//将各位置入新的数组
    	y = x/10;//取进位
    	head.next= addTwoNumbers((l1==null?null:l1.next),(l2==null?null:l2.next));
    	return head;

    }
}