package data_structure;
import java.io.*;
class Stack
{
	static int max=1000;
	int []arr=new int[max];
	int top;
	
	Stack()
	{
		top=-1;
	}
	void push(int value)
	{
		if(top>=max)
			System.out.print("\nStack overflow");
		
		
		else
		{
			++top;
			arr[top]=value;
			System.out.print("\nThe element is successfully pushed into the stack\n");
		}
		
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.print("\nStack underflow");
			return 0;
		}
		else
		{
			int value=arr[top--];
			return value;
		}
	}
	
	void print()
	{
		if(top==-1)
			System.out.print("\nThe Stack is empty.\n");
		else
		{
			System.out.print("\n Stack:\t[  ");
			int i=0;
			for(;i<=top;i++)
				System.out.print(arr[i]+"  ");
			System.out.print("]\n");
		}
			
	}

		
	
}
public class ImplimentingStack {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack obj=new Stack();
		System.out.print("\tImplementation of Basic Stack\n\t@Nishant Amoli,Btech IT");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\n\n\t 1:For pushing an element.\n\t2:For popping the element\n\t3:To display the elements in the stack\n");
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
			obj.push(element);
			break;
		case 2:
			int get=obj.pop();
			System.out.print("\n"+get+" successfully popped from the Stack");
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
