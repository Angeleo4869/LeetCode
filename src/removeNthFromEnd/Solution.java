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
//class Solution {//两次扫描实现
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//    	int length = 0;
//    	ListNode list = head;
//    	while(list ==null) {//获取链表长度
//    		length++;
//    		list = list.next;  		
//    	}
//    	list = head;
//    	for(int i=0;i<length-n;i++) {//定位到倒数第n个位置的前一位
//    		list = list.next;
//    	}
//    	if(n == length) {//如果删除的是最后一个节点
//    		list.next = null;
//    	}else if(list.next != null){
//    		list.next = list.next.next;
//    	}
//    	return head;
//    }
//}



class Solution{//一次扫描实现
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode listp = head,listq = head;//定义两个指针p，q
		while(listp != null) {//p指向第n个元素之后，q开始从第一个元素向下遍历，直至p指向最后一个元素
			listp = listp.next;
			if(n-- < 0) listq = listq.next;//此时q所指向的元素距离最后一个元素为n，即倒数第n个元素的前一个元素
		}
        if(listq==head && n == 0){//判断是否指向头部，如果为头部则将头部删除
            head = head.next;
        }else if(listq.next != null) {
			listq.next = listq.next.next;
		}else listq = null;
		return head;
	}
}





