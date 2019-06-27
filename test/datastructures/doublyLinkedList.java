/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Rajat
 */
public class doublyLinkedList {
    public static listnode head;
    public static listnode tail;
    public static class listnode
    {
        int data;
        listnode next;
        listnode previous;
        public listnode(int data)
        {
            this.data=data;
            next=null;
            previous = null;
        }
    }
    public static void insertLast(listnode add)
    {
        if(head==null)
        {
            head=add;
            tail=add;
        }
        tail.next=add;
        add.previous=tail;
        tail=add;
        
    }
    public static void print()
    {
        listnode current =head;
        if(current==null)
        {
            System.out.println("Nothing to Print");
        }
        while(current!=null)
        {
            System.out.println("data : " + current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        listnode first = new listnode(10);
        head=first;
        tail=first;
        listnode second = new listnode(20);
        insertLast(second);
        print();
        
        
        
    }
}
