package practice;

public class LinkList 
{
	Node head;
	Node tail;
	private class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	LinkList()
	{
		head=null;
		tail=null;
	}
	public void insert(int d)
	{
		if(head==null)
		{
			head=new Node(d);
			tail=head;
			return;
		}
		else
		{		
			tail.next=new Node(d);
			tail=tail.next;
			return;
		}
	}
	public void display()
	{
		if(head==null)
			System.out.print("\nEmpty link list\n");
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}			
		}
	}
	public void remove(int d)
	{
		if(head.data==d)		
			head=head.next;
		else if(tail.data==d)
		{
			Node temp=head;
			while(temp.next!=tail)
				temp=temp.next;
			tail=temp;
			tail.next=null;
		}
		
		else
		{
			Node temp=head;
			while(temp.next.data!=d)
			{
				temp=temp.next;
				try{
				if(temp==tail)
					throw new NotFoundException(d);
				}catch(NotFoundException e){e.printStackTrace();}
			}
			temp.next=temp.next.next;
			
		}
	}
	public void toFirst()
	{
		Node temp=head;
		while(temp.next!=tail)
			temp=temp.next;
		tail.next=head;
		head=tail;
		tail=temp;
		tail.next=null;
		
	}
	public void reverse()
	{		
		Node prev=null;
		Node cur=head;
		Node suc=null;
		tail=cur;
		while(cur != null)
		{
			suc=cur.next;
			cur.next=prev;;
			prev=cur;
			cur=suc;
			if(cur==null)
				head=prev;
			
		}
		
	}
	private void traverseRecursion(Node h)
	{
		if(h==null)
			return;
		System.out.print(h.data+" ");
		traverseRecursion(h.next);
	}
	public void displayRecursion()
	{
		traverseRecursion(head);
	}
	

}
