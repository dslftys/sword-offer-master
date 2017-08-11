package com.dsl.question8;

import com.dsl.utils.TreeLinkNode;

/**
 * Created by Victor on 2017/8/10.
 * 找到二叉树的下一个节点。其中给定的pNode就是二叉树的某一个节点，中序遍历的下一个节点可以这样理解。
 * 他为右子树的时候，其中序遍历的下一个节点为他的右子树的左侧节点
 * 他不为右子树的时候，他中序遍历的下一个节点为他的父节点。
 */
public class getNext {
    public TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        TreeLinkNode pNext = null;
        if (pNode.right != null) {//有右子树
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;//找到右子树的左节点，是中序遍历
            }
            pNext = pRight;
        } else if (pNode.parent != null) {//指向的节点有父节点
            TreeLinkNode pCurrent = pNode;
            TreeLinkNode pParent = pNode.parent;
            while (pParent != null && pCurrent == pParent.right) {
                pCurrent = pParent;
                pParent = pParent.parent;
            }
            pNext = pParent;
        }
        return pNext;

    }
}
