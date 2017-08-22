package com.dsl.question18;

import com.dsl.utils.ListNode;

/**
 * Created by Victor on 2017/8/20.
 * 排序链表中，删除链表中重复的节点
 */
public class DeleteRepeatNode {

    public ListNode DelteDuplication(ListNode pHead){
        if (pHead == null)
            return null;
        ListNode p = pHead;
        ListNode n = new ListNode(0);
        ListNode pre = n;
        n.next = pHead;
        boolean flag = false;
        while (p != null) {
            ListNode q = p.next;
            if (q == null) break;
            if (q.val == p.val) {
                while (q != null && q.val == p.val) {
                    q = q.next;
                }
                pre.next = q;
                p = q;
            } else {
                if (!flag) {
                    n.next = p;
                    flag = true;
                }
                pre = p;
                p = q;
            }
        }
        return n.next;
    }
}
