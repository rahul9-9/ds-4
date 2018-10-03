import java.util.*;
class node
{
	node head=null; 
	int data;
	node next;
	public node() 
	{
		this.data=0;
		this.next=null;
	}
	public node(int data1)
	{
		this.data=data1;
		this.next=null;
	}

public node add(int data)
{
	node n=new node(data);
	if(head==null) 
	{
		head=n;
	}
	else         
	{
		node temp=head; 
		while(temp.next!=null) 
		{                      
			temp=temp.next; 
		}  
		temp.next=n; 
	}
	return head;
}
public node reverse(node data1)
{
	node prev=null;
	node current=data1;
	node next=null;
	while(current!=null)
	{
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	data1=prev; 
   return data1;
}
public void print(node head)
{
	node temp=head;
	while(temp!=null) 
    {
		System.out.println(temp.data);
		temp=temp.next; 
    }
}
}
class Revlist
{
	public static void main(String[] args)
	{
		node a= new node();
 		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of nodes = ");
		int x=s.nextInt();
		node h=null;
		while(x!=0) 
		{
			int n=s.nextInt();
			h=a.add(n);  
			x--;
		}
		h=a.reverse(h);
		System.out.println("Nodes are : ");
		a.print(h);
	}
}