package Linkedlist;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false
 * @author keyboardhero
 * @create 2022-09-22 10:31
 */
public class _234_simple {
    //反转后半段链表
    public boolean isPalindrome(ListNode head) {
        //通过快慢指针找到链表的中点
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //奇数节点时需处理slow后移一位
        if(fast!=null){
            slow=slow.next;
        }

        slow=reverse(slow);
        fast=head;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    //反转链表
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
