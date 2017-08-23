package com.dsl.question26;

import com.dsl.utils.TreeNode;

/**
 * Created by Victor on 2017/8/23.
 * 修改，double类型判断相等
 */
public class ContainTree {
    public boolean hasSubTree(TreeNode root1,TreeNode root2){
        boolean result=false;
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                isContainTree(root1,root2);
            }
            if(!result){
                result=hasSubTree(root1.left,root2);
            }
            if(!result){
                result  =hasSubTree(root1.right,root2);
            }
        }
        return result;
    }
    public boolean isContainTree(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return  false;
        }
        return isContainTree(root1.left,root2.left)&&isContainTree(root1.right,root2.right);
    }
    public boolean equal(double num1,double num2){
        if(Math.abs(num1-num2) <0.0000001){
            return true;
        }else{
            return false;
        }
    }
}
