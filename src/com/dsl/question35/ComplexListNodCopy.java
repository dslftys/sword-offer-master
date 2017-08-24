package com.dsl.question35;

import com.dsl.utils.ComplexListNode;

/**
 * Created by Victor on 2017/8/24.
 */
public class ComplexListNodCopy {
    public ComplexListNode copyList(ComplexListNode head) {
        copyNode(head);
        processSibling(head);

        return split(head);
    }

    // 第一步 复制节点
    private void copyNode(ComplexListNode head) {
        ComplexListNode p = head;
        while (null != p) {
            ComplexListNode clonedNode = new ComplexListNode();
            clonedNode.val = p.val;
            clonedNode.next = p.next;
            clonedNode.sibling = null;
            p.next = clonedNode;
            p = clonedNode.next;
        }
    }

    // 第二步 处理sibling
    private void processSibling(ComplexListNode head) {
        ComplexListNode p = head;
        while (null != p) {
            ComplexListNode clonedNode = p.next;
            if (null != p.sibling) {
                clonedNode.sibling = p.sibling.next;
            }
            p = clonedNode.next;
        }
    }

    // 第三步 拆分
    private ComplexListNode split(ComplexListNode head) {
        ComplexListNode p = head;
        ComplexListNode cloneHead = null;
        ComplexListNode pClone = null;
        if (null != p) {
            pClone = cloneHead = p.next;
            p.next = pClone.next;
            p = p.next;
        }
        while (null != p) {
            pClone.next = p.next;
            pClone = pClone.next;
            p.next = pClone.next;
            p = p.next;
        }

        return cloneHead;
    }
}
