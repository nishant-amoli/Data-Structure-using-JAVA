package data_structure;

public class BST {
	Node root;
	class Node {
		private int data;
		Node left;
		Node right;
		Node( int data ) {
			this.data = data;
			left = null;
			right = null;			
		}
	}
	BST() {
		root = null;
	}
	public void insert( int d ) {
		if( root == null) {
			root=new Node( d );
			return;
		}
		Node temp = root;
		while( true ) {
			if( d > temp.data ) {
				if( temp.right == null) {
					temp.right = new Node( d );
					return;
				}
				temp = temp.right;
			}
			else {
				if( temp.left == null) {
					temp.left = new Node( d );
					return;
				}
				temp = temp.left;
			}
		}
		
	}
	public void inOrder() {
		if( root==null ) {
			System.out.print("\nTree Empty!\n");
			return;
		}			
		displayIn( root );
	}
	private void displayIn( Node r ) {
		if( r==null )
			return;
		displayIn( r.left );
		System.out.print(r.data+"  ");
		displayIn( r.right );
	}

}
