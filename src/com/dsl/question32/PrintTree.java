package com.dsl.question32;

import com.dsl.utils.TreeNode;

import java.util.*;

/**
 * Created by Victor on 2017/8/23.
 *
 *
 */
public class PrintTree {
    //不分行从上到下打印二叉树
    //从上到下打印每一个节点，同一层的节点按照从左到右的顺序打印
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

    /**
     * 分行从上到下打印二叉树
     * @param root
     */
    public void printFromTopToButton2(TreeNode root){
        if(root == null)
            return;
        //定义队列，先入先出
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int nextLevel=0;
        int toBePrinted=1;

        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.print(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
                ++nextLevel;
            }
            if(cur.right != null){
                queue.add(cur.right);
                ++nextLevel;
            }
            --toBePrinted;
            if(toBePrinted == 0){
                System.out.println();
                toBePrinted=nextLevel;
                nextLevel=0;
            }
        }
    }
    /**
     *之字形打印二叉树
     * 第一行按照从左到右的顺序，第二层按照从右到左的顺序打印，第三行按照从左到右的顺序，
     * 以此类推，
     */
    public ArrayList<ArrayList<Integer>>  printTreeWithZ(TreeNode root) {
        if(root == null){
            return null;
        }
        //存放奇数层节点
        Stack<TreeNode> stack1=new Stack<>();//从左到右
        stack1.push(root);
        //存放偶数层节点
        Stack<TreeNode> stack2=new Stack<>();//从右到左

        int layer=1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (!stack1.empty() || !stack2.empty()) {
            if (layer%2 != 0) {//奇数层
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack1.empty()) {
                    TreeNode node = stack1.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack2.empty()) {
                TreeNode node = stack2.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            }
        }
        return list;
    }
}
