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

public class DataStructures {
     private static listnode head=null;
     private static class listnode
     {
        private int data;
        listnode next;
        public listnode(int data)
        {
            this.data=data;
            this.next=null;
        }
      }
     //print linked list
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
      //return length of linked list
      public static int length()
      {
          int count=0;
          
          if(head==null)
          {
              return count;
          }
          else
          {
              listnode current;
          current=head;
              while(current!=null)
              {
                  count++;
                  current=current.next;
                  
              }
              return count;
          }
          
      }
      //insert at the beginning of linked list
      public static listnode insertfront(listnode newnode)
      {
          if(head == null)
          {
              head=newnode;
          }
              newnode.next=head;
              head=newnode;
          return head;
       
      }
      //insert at a given index
      public static void insertToIndex(listnode newNode, int index)
      {
          if(head==null)
          {
              
          }
          else
          {
              listnode current=head;
              for(int i=1;i<index-1;i++)
              {
                  current=current.next;
              }
              newNode.next=current.next;
              current.next=newNode;
          }
      }
      //append at the last 
      public static void append(listnode newNode)
      {
          if(head==null)
          {
              head=newNode;
          }
          listnode current=head;
          while(current.next!=null)
          {
              current=current.next;
          }
          current.next=newNode;
      }
      
      public static listnode deleteFirst()
      {
          if(head==null)
          {
              System.out.println("Empty list");
          }
          listnode current=head;
          current=current.next;
          int data=head.data;
          head.next = null;
          head=current;
          return head;
      }
      public static void find(int search)
      {
          listnode current = head;
          int found = 0;
          while(current!=null)
          {
              if(current.data==search)
              {
                  found = 1;
              }
             current=current.next;
          }
          if(found==1)
             {
                 System.out.println("Data Found");
             }
             else
             {
                 System.out.println("data not found");
             }
      }
      public static listnode reverse()
      {
        listnode current = head;
        listnode next = null;
        listnode previous = null;
        while(current!=null)
        {
            next= current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
      }
      
      public static int middleNode()
      {
          listnode fastptr=head;
          listnode slowptr=head;
          while(fastptr!=null&&fastptr.next!=null)
          {
              fastptr = fastptr.next.next;
              slowptr = slowptr.next;
              
          }
          return slowptr.data;
      }
      
      public static void sort()
      {
        listnode current = head;  
        listnode index = null;  
          
        if(head == null) 
            return;  
        else
        {
            while(current != null)
            {
                //Node index will point to node next to current  
                index = current.next;  
                  
                while(index != null)
                {
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.data > index.data){ 
                        int temp = current.data;  
                        current.data = index.data;  
                        index.data = temp; 
                    }
                    index = index.next;  
                     
                }
                current = current.next; 
            }
        }
      }
      public static int duplicate()
      {
          listnode current = head;
          listnode index = null;
          int duplicate = 0;
          if(current == null)
          {
              return 0;
          }
          else
          {
              while(current != null)
              {
                  index = current.next;
                  while(index!=null)
                  {
                      if(current.data == index.data)
                      {
                          duplicate = current.data;
                      }
                      index= index.next;
                  }
                  current=current.next;
              }
          }
          return duplicate;
      }
      
      
      public static void main(String[] args) {
        DataStructures instance = new DataStructures();
        listnode head1 = new listnode(10);
        head=head1;
        listnode append = new listnode(50);
        instance.append(append);
        //instance.print();
        listnode front = new listnode(70);
        head=DataStructures.insertfront(front);
       // DataStructures.print();
        listnode add=new listnode(110);
        DataStructures.insertToIndex(add, 3);
       //DataStructures.print();
       listnode first1 = new listnode(110);
       DataStructures.insertfront(first1);
       //DataStructures.print();
        //System.out.println("The length now is : "+DataStructures.length());
       // head1=DataStructures.deleteFirst();
       //DataStructures.print();
      // find(1000);
       //head = reverse();
      print();
       //System.out.println("the middle node data is : "+middleNode());
       System.out.println(" ");
       DataStructures.sort();
       DataStructures.print();
       System.out.println(DataStructures.duplicate());
       
    }
    
}
