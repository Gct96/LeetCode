package Linkedlist;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * @author keyboardhero
 * @create 2022-09-21 11:01
 */
public class _21_simple {
    //递归法
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //只要有一个为空，就返回另一个
        if(list1==null||list2==null){
            return list1==null?list2:list1;
        }
        ListNode first=(list1.val<list2.val)?list1:list2;
        first.next=mergeTwoLists(first.next,first==list1?list2:list1);
        return first;
    }
}
