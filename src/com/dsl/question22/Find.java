package com.dsl.question22;

import com.dsl.utils.ListNode;

import java.util.List;

/**
 * Created by Victor on 2017/8/22.
 * 链表中第K个节点
 */
public class Find {
    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null || k == 0){
            return null;
        }
        ListNode pHead=head;
        ListNode pBehind=head;
        for(int i=0;i<k-1;i++){
            if(pHead.next !=null){
                pHead =pHead.next;
            }else{
                return null;
            }
        }
        while(pHead.next !=null){
            pHead=pHead.next;
            pBehind=pBehind.next;
        }
        return pBehind;
    }

    public ListNode FindMiddleNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pHead=head;
        ListNode pBehind=head;
        while(pHead.next !=null && pHead.next.next!=null){
            pHead=pHead.next.next;
            pBehind=pBehind.next;
        }
        return pBehind;
    }
}
