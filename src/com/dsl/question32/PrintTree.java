package com.dsl.question32;

import com.dsl.utils.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Victor on 2017/8/23.
 * 不分行从上到下打印二叉树
 * 从上到下打印每一个节点，同一层的节点按照从左到右的顺序打印
 */
public class PrintTree {
    public void printFromTopToButton(TreeNode root){
        if(root == null)
            return;
        //定义队列，先入先出
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.println(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }



    }
}
