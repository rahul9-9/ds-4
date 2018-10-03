import java.util.*;
class oddelements
{
 Node head;
 class Node
 {
 	int data;
 	Node next;
 	Node(int d1)
 	{
 		data=d1;
 		next=null;
 	}
 }
 void extractEvenOdd()
 {
 	Node end=head;
 	Node prev=null;
 	Node curr=head;
 	while(end.next!=null)
 		end=end.next;
 	Node new_end=end;
 	while(curr.data%2!=0&&curr!=end)
 	{
 		new_end.next=curr;
 	    curr=curr.next;
 	    new_end.next.next=null;
 	    new_end=new_end.next;	 	
    }
    if(curr.data%2 ==0)
    {
    	head=curr;
    	while(curr!=end)
    	{
    		if(curr.data%2==0)
    		{
    			prev=curr;
    			curr=curr.next;
    		}
    		else
    		{
    			prev.next=curr.next;
    			curr.next=null;
    			new_end.next=curr;
    			new_end=curr;
    			curr=prev.next;
    		}
    	}
    }
    else
    	prev=curr;
    if(new_end!=end && end.data%2!=0)
    {
    	prev.next=end.next;
    	end.next=null;
    	new_end.next=end;
    }
}
void push(int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}
void printlist()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
public static void main(String[] args)
{
	oddelements l1=new oddelements();
	l1.push(11);
	l1.push(10);
	l1.push(15);
	l1.push(19);
	l1.push(8);
	l1.push(6);
	l1.push(3);
	l1.push(2);
	l1.push(0);
	System.out.println("Original Linked List:-");
    l1.printlist();
    l1.extractEvenOdd();
    System.out.println("Modified Linked List:-");
    l1.printlist();
}
}