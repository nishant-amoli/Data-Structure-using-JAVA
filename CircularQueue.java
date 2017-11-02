package data_structure;
import java.io.*;
class Queue
{
	static int max=1000;
	int []arr=new int[max];
	int front,rear,size;
	
	Queue(int n)
	{
		size=n;
		rear=-1;
		front=-1;
	}
	int enqueue(int value)
	{
		if((rear+1)%size==front)
		{
			System.out.print("\nQueue Completely Filled");
			return 0;
		}
		else if(rear==-1&&front==-1)
		{
			rear=0;
			front=0;
		}
		
		else
		{
			rear=(rear+1)%size;
			System.out.print("\nThe element is successfully enqueued\n");
		}
		arr[rear]=value;
		return 1;
	}
	int dequeue()
	{
		int value;
		if(front==-1&&rear==-1)
		{
			System.out.print("\nQueue is empty");
			return 0;
		}
		else if(front==rear)
		{
			value=arr[front];
			front=-1;
			rear=-1;
			
		}
		else 
		{
			value=arr[front];
			front=(front+1)%size;
			
		}
		return value;
	}
	
	void print()
	{
		if(front==-1 && rear==-1)
			System.out.print("\nThe Queue is empty.\n");
		else
		{
			System.out.print("\n Queue:\t[  ");
			int i=front;
			for(;i<=rear;i=(i+1)%size)
				System.out.print(arr[i]+"  ");
			System.out.print("]\n");
		}
			
	}

		
	
}
public class CircularQueue {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		System.out.print("\tImplementation of Circular Queue\n\t@Nishant Amoli,Btech IT");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n\n\tInput the size of the Queue\n");
		int n=Integer.parseInt(br.readLine());
		Queue obj=new Queue(n);
		System.out.print("\n\n\t 1:Enqueue.\n\t2:Dequeue\n\t3:To display the elements in the circular queue\n");
		int choice;
		char response;
		do
		{
			System.out.print("\nInput the number to perform respective operation\n");
			choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:
			System.out.print("\nInput the element\n");
			int element=Integer.parseInt(br.readLine());
			obj.enqueue(element);
			break;
		case 2:
			int get=obj.dequeue();
			System.out.print("\n"+get+" successfully dequeued the front.");
			break;
		case 3:
			obj.print();
			break;
		default:
			System.out.print("\nThe response you have given doesn't match with an appropriate option.\n");
		}
		System.out.print("\nDo you want to exit? Type 'Y/N'\n");
		response=br.readLine().charAt(0);
		
		}while(response!='Y');
	}

}
