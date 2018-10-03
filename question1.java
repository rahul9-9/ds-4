
import java.util.*;
class swap 
{ 
    Node head;  
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d1) 
        {
        data = d1; 
        next = null; 
        } 
    } 
  
    void pairSwap() 
    { 
        Node temp1 = head; 
        while (temp1 != null && temp1.next != null) 
        { 
            int x = temp1.data; 
            temp1.data = temp1.next.data; 
            temp1.next.data = x; 
            temp1 = temp1.next.next; 
         } 
    } 
    public void push(int data) 
    { 
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode; 
    } 
    void printList() 
    { 
        Node temp1 = head; 
        while (temp1 != null) 
        { 
           System.out.print(temp1.data+" "); 
           temp1 = temp1.next; 
        }   
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        swap s1 = new swap();
        s1.push(5); 
        s1.push(4); 
        s1.push(3); 
        s1.push(2); 
        s1.push(1); 
          
        System.out.println("Linked List before calling pairSwap() "); 
        s1.printList(); 
          
        s1.pairSwap(); 
          
        System.out.println("Linked List after calling pairSwap() "); 
        s1.printList(); 
    } 
} 