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
public class CircularLinkedList {
    public static listnode last;
    private static class listnode
    {
        int data;
        listnode next;
        public listnode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static listnode add(int data)
    {
        listnode add = new listnode(data);
        if(last==null)
        {
            last=add.next;
            last.next=add;
        }
        else
        {
            add.next=last.next;
            last.next=add;
            last=add;
        }
        return last;
    }
    public static void print()
    {
        listnode current;
        current= last.next;
        while(current.next!=last.next)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    
    public static void main(String[] args) {
        listnode first = new listnode(10);
        listnode second = new listnode(20);
        last=second;
        first.next=last;        
        last.next = first;
        last=add(30);
        print();
        
        
    }
}
