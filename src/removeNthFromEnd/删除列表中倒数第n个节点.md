#### [删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)

给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。

进阶：

尝试使用一趟扫描实现

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list

```java
public class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
```

```java
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
```

