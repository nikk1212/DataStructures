/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Stack;

/**
 *
 * @author Rajat
 */
public class Tree {
    private static Treenode root;
    public static void preorder(Treenode init)
    {
        if(init==null)
        {
            return;
        }
        System.out.println(init.data);
        preorder(init.left);
        preorder(init.right);
    }
        public static void inorder(Treenode init)
    {
        if(init==null)
        {
            return;
        }
        inorder(init.left);
        System.out.println(init.data);
        inorder(init.right);
    }
          public static void postorder(Treenode init)
    {
        if(init==null)
        {
            return;
        }
        inorder(init.left);
        inorder(init.right);
        System.out.println(init.data);
        
    }
    public static void preOrderI(Treenode init)
    {
        if(root==null)
        {
            return;
        }
        Stack <Treenode> stack = new Stack <>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            Treenode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
            if(temp.left!=null)
            {
                stack.push(temp.left);
            }
        }
        
    }
    private static class Treenode
    {
        int data;
        Treenode left;
        Treenode right;
        public Treenode(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Treenode first=new Treenode(10);
        root=first;
        Treenode second = new Treenode(20);
        Treenode third = new Treenode(30);
        root.left=second;
        root.right=third;
        Treenode fourth = new Treenode(40);
        Treenode fifth = new Treenode(50);
        second.left=fourth;
        second.right=fifth;
        Treenode sixth = new Treenode(40);
        Treenode seventh = new Treenode(50);
        third.left=sixth;
        third .right=seventh;
        preorder(root);
        System.out.println();
        preOrderI(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
