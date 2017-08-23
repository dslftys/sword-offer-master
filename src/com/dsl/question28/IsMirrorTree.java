package com.dsl.question28;

import com.dsl.utils.TreeNode;

/**
 * Created by Victor on 2017/8/23.
 * 判断一颗二叉树是不是对称的
 */
public class IsMirrorTree {
    public boolean isMirror(TreeNode root){
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 ==null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isMirror(root1.left,root2.right)&&isMirror(root1.right,root2.left);
    }
}
