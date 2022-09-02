package Linkedlist;

/**
 * 有一个单链表的head，我们想删除它其中的一个节点node。
 *
 * 给你一个需要删除的节点node。你将无法访问第一个节点head。
 *
 * 链表的所有值都是 唯一的，并且保证给定的节点node不是链表中的最后一个节点。
 */
//Definition for singly-linked list
class ListNode237 {
    int val;
    ListNode237 next;
    ListNode237(int x) { val = x; }
}

public class _237_middle {
    public void deleteNode(ListNode237 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
