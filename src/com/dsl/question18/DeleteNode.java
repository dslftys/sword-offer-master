package com.dsl.question18;

import com.dsl.utils.ListNode;

/**
 * Created by Victor on 2017/8/20.
 * 给定单向链表的头指针和一个节点，定义一个函数在O(1)时间删除该节点
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, ListNode node) {
        if (null == node || null == head) {
            return head;
        }
        if (head == node) {
            ListNode next = head.next;
            head = null;
            return next;
        } else {
            if (node.next == null) {
                ListNode p = head;
                while (p.next.next != null) {
                    p = p.next;
                }
                p.next = null;
            } else {
                node.val = node.next.val;
                node.next = node.next.next;
            }
            return head;
        }
    }

}
