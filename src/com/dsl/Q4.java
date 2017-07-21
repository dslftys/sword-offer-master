package com.dsl;

import com.dsl.utils.TreeNode;

/**
 * Created by Victor on 2017/7/18.
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 *
 */
public class Q4 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre == null || in == null) return null;
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode construct(int []pre, int startPre,int endPre,int []in,int startIn,int endIn){
        if(startPre > endPre || startIn >endIn){
            return  null;
        }
        TreeNode root=new TreeNode(pre[startPre]);
        for(int i=0;i<in.length;i++){
            if(pre[startPre] == in[i]) {//找出中序遍历中间节点
                root.left=construct(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=construct(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);

            }
        }
        return root;

    }
}
