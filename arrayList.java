package data_structure;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of ArrayList in JAVA\n\t@Nishant Amoli,Btech IT");		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		//Adding elements into array list.
		arr.add(1);
		arr.add(5);
		arr.add(9);
		//Printing the array list.
		System.out.print("\nArray List:\n"+arr);
		//Deleting the elements from array list using index.
		arr.remove(1);
		//Printing the array list after deletion of 2nd element.
		System.out.print("\nArray List:\n[");
		for(int i=0;i<arr.size();i++)System.out.print(" "+arr.get(i)+" ");
		System.out.print("]\n\n");
		
		ArrayList<String> ar=new ArrayList<String>();
		//Adding elements into array list.
		ar.add("Nishant");
		ar.add("Saransh");
		ar.add("Ritu");
		ar.add("Rajat");
		//Printing the array list.
		System.out.print("\nArray List:\n"+ar);
		//Deleting the elements from array list using index.
		ar.remove(1);
		//Printing the array list after deletion of 2nd element.
		System.out.print("\nArray List:\n[");
		for(int i=0;i<ar.size();i++)System.out.print(" "+ar.get(i)+" ");
		System.out.print("]");
	}	
}
		