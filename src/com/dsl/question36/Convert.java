package com.dsl.question36;

import com.dsl.utils.TreeNode;

/**
 * Created by Victor on 2017/8/24.
 * 输入一颗二叉搜索树，将该二叉搜索树转换成一个排序的双向链表
 * 要求不能创建任何新的节点，只能调整树中节点指向的指针
 */
public class Convert {
    private TreeNode lastNode=null;
    public TreeNode convert(TreeNode root){
        if (root == null){
            return null;
        }
        ConvertNode(root);
        while (lastNode != null && lastNode.left !=null){
            lastNode=lastNode.left;
        }
        return lastNode;
    }
    public void ConvertNode(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode current=root;
        if(current.left != null){
            convert(current.left);
        }
        current.left=lastNode;
        if(lastNode!=null){
            lastNode.right=current;
        }
        lastNode=current;
        if(current.right != null){
            convert(current.right);
        }
    }
}
