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
public class Queue {
    public static listnode head;
    public static listnode tail;
    public static void enqueue(int data)
    {
        listnode add = new listnode(data);
        if(head==null)
        {
            head=add;
            tail=add;
        }
        else
        {
            tail.next=add;
            tail=add;
        }
        
    }
    public static listnode dequeue()
    {
        if(head==null)
        {
            System.out.println("Queue is empty");
        }
        else if(head.next==null)
                {
                    head=null;
                    
                }
        else{
        listnode current;
        current = head;
        current=current.next;
        head.next=null;
        head=current;
        
        }
        return head;
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
            System.out.println(current.data);
            current = current.next;
        }
    }
    private static class listnode
    {
        private int data;
        private listnode next;
        public listnode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        print();
        
    }
}
