package com.dsl.question23;

import com.dsl.utils.ListNode;

import java.util.List;

/**
 * Created by Victor on 2017/8/22.
 * 如果一个链表中包含环，如何找出环的入口节点？
 */
public class MeetingNode {
    public ListNode EntryNodeOfLoop(ListNode head){
        ListNode meetingNode=MeetingNode(head);
        if(meetingNode == null){
            return null;
        }
        //得到环中节点的数目
        int nodesInLoop=1;
        ListNode pNode=meetingNode;
        while (pNode.next !=meetingNode){
            pNode=pNode.next;
            ++nodesInLoop;
        }
        //先移动pNode 次数为环中节点的数目
        pNode=head;
        for(int i=0;i<nodesInLoop;++i){
            pNode=pNode.next;
        }
        ListNode pNode2=head;
        while (pNode != pNode2){
            pNode=pNode.next;
            pNode2=pNode2.next;
        }
        return pNode;
    }
    public ListNode MeetingNode(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow=head.next;
        ListNode fast=slow.next;
        while (fast !=null && slow!=null){
            if(fast == slow){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
            if(fast != null){
                fast=fast.next;
            }
        }
        return null;
    }
}
