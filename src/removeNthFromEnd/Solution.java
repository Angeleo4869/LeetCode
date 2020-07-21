package removeNthFromEnd;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
//class Solution {//����ɨ��ʵ��
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//    	int length = 0;
//    	ListNode list = head;
//    	while(list ==null) {//��ȡ������
//    		length++;
//    		list = list.next;  		
//    	}
//    	list = head;
//    	for(int i=0;i<length-n;i++) {//��λ��������n��λ�õ�ǰһλ
//    		list = list.next;
//    	}
//    	if(n == length) {//���ɾ���������һ���ڵ�
//    		list.next = null;
//    	}else if(list.next != null){
//    		list.next = list.next.next;
//    	}
//    	return head;
//    }
//}



class Solution{//һ��ɨ��ʵ��
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode listp = head,listq = head;//��������ָ��p��q
		while(listp != null) {//pָ���n��Ԫ��֮��q��ʼ�ӵ�һ��Ԫ�����±�����ֱ��pָ�����һ��Ԫ��
			listp = listp.next;
			if(n-- < 0) listq = listq.next;//��ʱq��ָ���Ԫ�ؾ������һ��Ԫ��Ϊn����������n��Ԫ�ص�ǰһ��Ԫ��
		}
        if(listq==head && n == 0){//�ж��Ƿ�ָ��ͷ�������Ϊͷ����ͷ��ɾ��
            head = head.next;
        }else if(listq.next != null) {
			listq.next = listq.next.next;
		}else listq = null;
		return head;
	}
}





