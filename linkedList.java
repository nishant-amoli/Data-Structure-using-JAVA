package data_structure;
import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Link List in JAVA\n\t@Nishant Amoli,Btech IT");
		LinkedList <Integer> list=new LinkedList<Integer>();
		//Adding the elements in list.
		list.add(10);
		list.addLast(5);
		list.addFirst(7);
		//Adding element 
		list.add(2,9);
		//Displaying the contents of the linked list.
		System.out.print("\nLinkedList:\n"+list);
		//Removing the elements from LinkedList,
		list.remove();
		//Displaying the contents of the linked list.
		System.out.print("\nLinkedList:\n"+list);
		list.removeLast();
		//Displaying the contents of the linked list.
		System.out.print("\nLinkedList:\n"+list);
		//Adding the elements in list.
		list.add(11);
		//Displaying the contents of the linked list.
		System.out.print("\nLinkedList:\n"+list);
		//Removing the element at index 3.
		list.remove(2);
		//Displaying the contents of the linked list.
		System.out.print("\nLinkedList:\n"+list);
		//Getting the size of the list.
		int size=list.size();
		System.out.print("\nSize of linked list: "+size);
		
	}

}
