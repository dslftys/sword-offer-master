package com.dsl.question34;

import com.dsl.utils.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Victor on 2017/8/24.
 * 输入一个二叉树和整数，打印出二叉树中节点值得和为输入整数的所有路径，从树的根节点开始往下一直
 * 到叶子节点所经过的形成一条路径
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Integer> stack=new Stack<>();
        generate(root,target,stack,list);
        return list;

    }
    public void generate(TreeNode root,int target,Stack<Integer>stack,ArrayList<ArrayList<Integer>> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.val == target){
                ArrayList<Integer> temList=new ArrayList<>();
                for(int i:stack){
                    temList.add(i);
                }
                temList.add(root.val);
                list.add(temList);
            }
        }else {
            stack.push(root.val);
            generate(root.left,target-root.val,stack,list);
            generate(root.right,target-root.val,stack,list);
            stack.pop();
        }
    }
}
