package data_structure;

public class DoublyLinkList {
	Node head,tail;
	private class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	DoublyLinkList()
	{
		head=null;
		tail=null;
	}
	public void add(int d)
	{
		if(head == null)
		{
			head=new Node(d);
			head.prev=null;
			tail=head;
		}
		else
		{
			tail.next=new Node(d);
			tail.next.prev=tail;
			tail=tail.next;
		}
	}
	public void display()
	{
		if(head == null)
			System.out.print("No element present in the link list!");
		else
		{
			Node temp=head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
			
	}
	public void remove(int d)
	{
		try
		{
			if(head==null)
				throw new DLLException();
		}catch(DLLException e){e.printStackTrace();}
		if(head.data==d)
		{
			head=head.next;
			head.prev=null;
		}
		else if(tail.data==d)
		{
			tail=tail.prev;
			tail.next=null;
		}
		else
		{
			Node temp=head;
			while(temp.data!=d)
			{
				temp=temp.next;
				try
				{
					if(temp==tail)
						throw new ElementNotFound(d);
				}catch(ElementNotFound e){e.printStackTrace();}				
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}

}
