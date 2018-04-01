package nestedClass;

public class CircularList {
	Node head,tail;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	CircularList()
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
			tail.next=head;
		}
		else
		{
			tail.next=new Node(d);
			tail=tail.next;
			tail.next=head;
		}
	}
	public void display()
	{
		Node temp=head.next;
		System.out.print(head.data+"  ");
		while(temp != head)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}

}
