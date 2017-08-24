package com.dsl.question33;

/**
 * Created by Victor on 2017/8/24.
 * 判断某数组是不是儿叉搜索树后续遍历序列
 */
public class VerifySequence {
    public boolean VerifySequenceOfBST(int []sequence,int start,int end){
        if(sequence == null || sequence.length <=0 ||end <=0){
            return false;
        }
        int root=sequence[end-1];//最后一个为根节点
        //在儿叉搜索树中左子树的值小于根节点的值。
        int i=0;
        for(i=0;i<end-1;i++){
            if(sequence[i]>root)
                break;
        }
        //在二叉树中右子树的值大于根节点的值
        int j=i;
        for(;j<end-1;j++){
            if(sequence[j]<root){
                return false;
            }
        }
        //判断左子树是不是二叉树
        boolean left=true;
        if(i>0){
            left=VerifySequenceOfBST(sequence,0,i);
        }

        //判断右子树是不是二叉树
        boolean right=true;
        if(i<end-1){
            right=VerifySequenceOfBST(sequence,i,end-1);
        }
        return left&&right;
    }
}
