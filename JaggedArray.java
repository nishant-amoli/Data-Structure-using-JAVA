package data_structure;
import java.io.*;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Jagged Array\n\t@Nishant Amoli,Btech IT");
		int arr[][]=new int[5][];
		System.out.print("\n Enter the elements in the array:\n");
		Scanner scan=new Scanner(System.in);
		//Creating Jagged Array
		for(int i=0;i<arr.length;i++)
			arr[i]=new int[i+1];
		//Initializing the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=scan.nextInt();
				
		}
		System.out.print("\n The Jagged Array you initialized:\n");
		//Displaying the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.print("\n");
				
		}
				
		
		
		

	}

}
