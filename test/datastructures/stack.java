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
public class stack {
    public static listnode head;
    private static class listnode
    {
        int data;
        listnode next;
        
        public listnode(int data)
        {
            this.data = data;
            this.next = null;
        }
          
    }
    public static listnode push(int data)
    {
        listnode add = new listnode(data);
        if(head==null)
        {
            head=add;
        }
        else
        {
            add.next=head;
            head=add;
        }
        return head;
    }
    
    public static listnode pop()
    {
        listnode current = head;
        current = current.next;
        head.next = null;
        head = current;
        return head;
        
    }
    
         public static void print()
        {
            listnode current;
            current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    
    public static void main(String args[])
    {
        listnode new1 = new listnode(10);
        head = new1;
        head = push(20);
        head = push(30);
        head = push(40);
        print();
       System.out.println(" ");
        head = pop();
        print();
        
        
        
    }
}
