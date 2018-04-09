package data_structure;
public class BinarySearchTree
{
	private class treeNode
	{
		int data;
		treeNode left;
		treeNode right;
		treeNode(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	treeNode root;
	BinarySearchTree()
	{
		root=null;
	}
	public void insert(int data)
	{
		if(root==null)
		{
			root=new treeNode(data);
			return;
		}
		treeNode temp=root;
		while(true)
		{
			if(temp.data>data)
			{
				if(temp.left==null)
				{
					temp.left=new treeNode(data);
					return;
				}	
				else
					temp=temp.left;
			}
			else
			{
				if(temp.right==null)
				{
					temp.right=new treeNode(data);
					return;
				}	
				else
					temp=temp.right;
			}
		}
	}
	public void inOrder()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		displayIn(root);
	}
	private void displayIn(treeNode rt)
	{
		if(rt==null)
			return;
		displayIn(rt.left);
		System.out.print(rt.data+" ");
		displayIn(rt.right);
	}
	public void preOrder()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		displayPre(root);
	}
	private void displayPre(treeNode rt)
	{
		if(rt==null)
			return;
		System.out.print(rt.data+" ");
		displayPre(rt.left);		
		displayPre(rt.right);
	}
	public void postOrder()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		displayPost(root);
	}
	private void displayPost(treeNode rt)
	{
		if(rt==null)
			return;
		displayPost(rt.left);		
		displayPost(rt.right);
		System.out.print(rt.data+" ");
	}
	public int minimun()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return min(root);
	}
	private int min(treeNode rt)
	{	
		while(rt.left != null)
			rt=rt.left;
		return rt.data;
	}
	public int maximum()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return max(root);
	}
	private int max(treeNode rt)
	{		
		while(rt.right != null)
			rt=rt.right;
		return rt.data;
	}
	public void remove(int data)
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		if(!search(root,data))
		{
			try
			{
				throw new ElementNotPresentException(data);
			}catch(ElementNotPresentException e){e.printStackTrace();}
		}
		root=delete(root,data);
	}
	private treeNode delete(treeNode rt,int data)
	{
		if(rt==null)
			return rt;
		if(rt.data>data)
			rt.left=delete(rt.left,data);
		else if(rt.data<data)
			rt.right=delete(rt.right,data);
		else
		{
			//Leaf Node
			if(rt.left==null && rt.right==null)
				rt=null;
			//Has a Left Child
			else if(rt.right==null)
				rt=rt.left;
			//Has a Right Child
			else if(rt.left==null)
				rt=rt.right;
			//Full Node
			else
			{
				rt.data=min(rt.right);
				rt.right=delete(rt.right,rt.data);				
			}
		}
		return rt;
	}
	public int countLeaves()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return countLeaf(root);
	}
	private int countLeaf(treeNode rt)
	{
		if(rt==null)
			return 0;
		if(rt.left==null && rt.right==null)
			return 1;
		else
			return countLeaf(rt.left)+countLeaf(rt.right);
	}
	public int countFullNodes()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return countFull(root);
	}
	private int countFull(treeNode rt)
	{
		if(rt==null)
			return 0;
		if(rt.left==null && rt.right==null)
			return 0;
		else if(rt.left!=null && rt.right!=null)
			return 1+countFull(rt.left)+countFull(rt.right);
		else
			return countFull(rt.left)+countFull(rt.right);
	}
	public int countHalfNodes()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return countHalf(root);
	}
	private int countHalf(treeNode rt)
	{
		if(rt==null)
			return 0;
		if(rt.left==null && rt.right==null)
			return 0;
		else if(rt.left!=null && rt.right!=null)
			return countHalf(rt.left)+countHalf(rt.right);
		else
			return 1+countHalf(rt.left)+countHalf(rt.right);
	}
	public boolean isPresent(int key)
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return search(root,key);
	}
	private boolean search(treeNode rt,int key)
	{
		if(rt==null)
			return false;
		else
		{
			if(rt.data>key)
				return search(rt.left,key);
			else if(rt.data<key)
				return search(rt.right,key);
			else
				return true;
		}		
	}
	public boolean isComplete()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return checkComplete(root);
	}
	private boolean checkComplete(treeNode rt)
	{
		if(rt==null)
			return true;
		if(rt.left==null && rt.right==null)
			return true;
		else if(rt.left !=null && rt.right!=null)
			return true & checkComplete(rt.left) & checkComplete(rt.right);
		else
			return false;
	}
	public int treeHeight()
	{
		if(root==null)
		{
			try
			{
				throw new EmptyTreeException();
			}catch(EmptyTreeException e){e.printStackTrace();}
		}
		return height(root);
	}
	private int height(treeNode rt)
	{
		if(rt==null)
			return 0;
		if(rt.left==null && rt.right==null)
			return 0;
		else
		{
			int leftHeight=height(rt.left);
			int rightHeight=height(rt.right);
			return 1+((leftHeight>rightHeight?leftHeight:rightHeight));
		}
			
	}	
}
class EmptyTreeException extends Exception {
	public String toString()
	{
		return "\nNo Element present in the BinarySearchTree";
	}

}
class ElementNotPresentException extends Exception {
	int data;
	ElementNotPresentException(int data)
	{
		this.data=data;
	}
	public String toString()
	{
		return "\n"+data+" not present in the BinarySearchTree!";
	}
}
