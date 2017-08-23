package com.dsl.question27;

import com.dsl.utils.TreeNode;

/**
 * Created by Victor on 2017/8/23.
 */
public class Mirror {
    public void mirrorTree(TreeNode root){
        if(root == null || (root.left == null && root.right == null)){
            return ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;//交换左右孩子
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
    }
}
