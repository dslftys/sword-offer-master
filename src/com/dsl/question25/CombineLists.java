package com.dsl.question25;

import com.dsl.utils.ListNode;

/**
 * Created by Victor on 2017/8/23.
 */
public class CombineLists {
    public ListNode merge(ListNode head1,ListNode head2){
        if(head1 == null){
            return head2;
        }else if(head2 == null){
            return head1;
        }
        ListNode MergeHead=null;
        if(head1.val <head2.val){
            MergeHead=head1;
            MergeHead.next=merge(head1.next,head2);
        }else {
            MergeHead=head2;
            MergeHead.next=merge(head1,head2.next);
        }
        return MergeHead;
    }

}
