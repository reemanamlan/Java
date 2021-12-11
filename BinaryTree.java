import java.util.Scanner;
import javax.swing.*;
class BinaryTree
{
int data;
BinaryTree left,right,root;

	public BinaryTree(int x)
	{
		this.left=this.right=null;
		data=x;
	}
	    
	public void insert( int i )
	{
		if (i <= data)
		{
			if (left != null)
				left.insert(i);
			else
				left = new BinaryTree( i );
		}
		else if (i >= data)
		{
			if (right != null)
				right.insert(i);
			else
				right = new BinaryTree( i );
		}
	}
     
	     public boolean isEmpty()
	     {
        		 return root == null;
    	 }
    	 
	public boolean search(BinaryTree r, int val)
	{
	         boolean found = false;
	         while ((r != null) && !found)
	         {
	             int rval = r.data;
	             if (val < rval)
                 r = r.left;
	             else if (val > rval)
	                 r = r.right;
	             else
	             {
	                 found = true;
	                 break;
	             }
	             found = search(r, val);
	         }
	         return found;
	     }

	public void inOrder(BinaryTree tree)
	{
		if(tree!=null)
		{
			inOrder(tree.left);
			System.out.print(tree.data+" ");
			inOrder(tree.right);
		}
	}

		public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter Root Node\n");
		int n = scan.nextInt();  
		BinaryTree ob=new BinaryTree(n);
		System.out.println("Binary Search Tree Test\n");          
		char ch;
	    do    
	    {
			System.out.println("\nBinary Search Tree Operations\n");
	        System.out.println("1. INSERT ");
	
	        System.out.println("2. SEARCH");
	        int choice = scan.nextInt();            
	        switch (choice)
            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                ob.insert( scan.nextInt() );     
	                	          	ob.inOrder(ob);
	                break;                          
	 
	            case 2 : 
	                System.out.println("Enter integer element to search");
	               	System.out.println("Search result : "+ ob.search(ob,scan.nextInt() ));
	                break;                                          
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = scan.next().charAt(0);                        
		} while (ch == 'Y'|| ch == 'y');      }}         
