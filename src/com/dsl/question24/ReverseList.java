package com.dsl.question24;

import com.dsl.utils.ListNode;

import java.util.List;

/**
 * Created by Victor on 2017/8/22.
 * 定义一个函数，输入链表的头节点，反转该链表并输出反转链表后的节点
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pre=null;
        ListNode cur=head;
        ListNode reverseNode=null;
        while (cur!=null){
            ListNode next=cur.next;
            if(next == null){
                reverseNode=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return reverseNode;
    }
}
