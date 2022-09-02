package Linkedlist;

/**给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 * @author keyboardhero
 * @create 2022-09-02 23:36
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class _19_middle {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=head; //定义一个删除节点的前节点
        int last=length(head)-n;//定义这个前节点所在位置
        if(last==0) //删除的是头节点
            return head.next;
        for(int i=0;i<last-1;i++){ //让前节点移动到所在位置
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return head;
    }

    private int length(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
