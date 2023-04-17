import java.util.LinkedList;


public class BinaryTree {
	static public class Node{
		int data;
		Node left;
		Node right;
		
		Node()
		{
			left = null;
			right = null;
		}
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	static Node root;

	BinaryTree()
	{
		root = null;
	}
	static class Tree{
		
		public void insertTree(int data)
		{
			if(root == null)
			{
				root = new Node();
				root.data = data;
			}
			else if(root != null)
			{
				Node temp = root;
				
				boolean hold = true;
				Node temp2 = new Node();
				temp2.data = data;
				
				while(hold == true)
				{
					if(data < temp.data && temp.left != null)
					{
						temp = temp.left;
					}
					else if(data > temp.data && temp.right !=null)
					{
						temp = temp.right;
					}
					else if(data < temp.data && temp.left == null)
					{
						
						
						temp.left = temp2;
						hold = false;
					}
					else if(data > temp.data && temp.right == null)
					{
						
						temp.right = temp2;
						hold = false;
					}
					
					
				}
				
			}
		
				
		}
		
		public int[] increasingOrder()
		{
			int arr[] = {0,0,0,0,0,0,0};
			Node temp = root;
			Node temp2 = new Node();
			boolean hold = true;
			int count = 0;
			int a=0;
			int b=0;
		while(hold == true)
			{	
				if(temp == root)
				{
					temp=temp.left;
				}
				else if(temp.left!=null && a==0)
				{
					temp2 = temp;
					temp = temp.left;
					
					
				}
				else if(temp.left == null && a==0)
				{
					arr[count] = temp.data;
					count++;
					temp = temp2;
				
					a++;
				}
				else if(a>0 && b==0)
				{
					
					arr[count] = temp.data;
					count++;
					temp=temp.right;
					b++;
				}
				else if(b>0)
				{
					
					arr[count] = temp.data;
					count++;
					if(temp.left ==null && temp.right==null)
					{
						arr[count] = root.data;
						count++;
						hold = false;
					}
				}
				
				
				
			}
			hold = true;
			temp = root;
			temp2 = root;
			int c=0;
			int d = 0;
			while(hold == true)
			{
				if(temp==root)
				{
					temp = temp.right;
				}
				else if(temp.right!=null)
				{
					arr[count] = temp.data;
					count++;
					temp = temp.right;
				}
				else if(temp.left == null &&temp.right==null)
				{
					arr[count] = temp.data;
					count++;
					hold = false;
				}
			}
			
			return arr;
		}
		public void checkval()
		{
			Node temp = root;
			boolean hold = true;
			int check = 4;
			while(hold == true)
			{
				if(check<temp.data)
				{
					temp = temp.left;
				}
				else if(check>temp.data)
				{
					temp=temp.right;
				}
				else if(check == temp.data)
				{
					System.out.print("\n\nValue found in the tree..!!");
					hold = false;
				}
				else if(temp==null)
				{
					hold = false;
				}
			}
		}
		public void delNode2()
		{
			Node temp = root;
			boolean hold = true;
			int check = 2;
			Node temp2 = root;
			
			while(hold == true)
			{
				if(check<temp.data)
				{
					temp2 = temp;
					temp = temp.left;
				}
				else if(check>temp.data)
				{
					temp2 = temp;
					temp = temp.right;
				}
				else if(check == temp.data)
				{
					if(temp2.right == temp)
					{
						temp2.right = null;
						System.out.print("Value has been deleted.!");
						hold = false;
					}
					else if(temp2.left == temp)
					{
						temp2.left = null;
						System.out.print("Value has been deleted.!");
						hold = false;
					}
				}
				else if(temp==null)
				{
					System.out.print("No value found.!");
					hold = false;
				}
			}
		}
		public void delOneChild()
		{
			Node temp = root;
			int count =0;
			Node temp2 = root;
			boolean hold = true;
			int a = 0;
			while(hold == true)
			{
				if(temp == root)
				{
					temp = temp.left;
				}
				else if(temp.left !=null)
				{
					temp2 = temp;
					temp = temp.left;
				}
				else if(temp.left == null && temp.right !=null)
				{
					temp2 = temp;
					temp = temp.right;
				}
				else if(temp.left == null &&temp.right == null)
				{
					if(temp2.left == temp)
					{
						temp.left = null;
					}
					else if(temp2.right == temp)
					{
						temp.right =null;
					}
					System.out.print("Node with One Child has been deleted.!");
					hold = false;
				}
			}
			
		}
		
		public void Del2Child()
		{
			Node temp = root;
			Node temp2 = root;
			int a = 0;
			int b = 0;
			boolean hold = true;
			
			while(hold==true)
			{
				if(root == temp)
				{
					temp2 = temp;
					temp = temp.right;
				}
				else if(temp.right !=null && temp.left !=null)
				{
					temp.left.data = temp.data;
					temp.left = null;
					System.out.print("\nNode with 2 Children has been deleted");
					hold = false;
				}
			}
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {5,7,3,2,4,6,8};
		int count = 7;
		
		Tree a = new Tree();
		for(int i=0;i<count;i++)
		{
			a.insertTree(arr[i]);
		}
		System.out.print("Order of Input:");
		for(int i = 0;i<7;i++)
		{
			System.out.print(arr[i] + "->");
		}
		
		int arr2[] = {0,0,0,0,0,0,0};
		System.out.print("\n");
		
		System.out.print("\n");
		arr2 = a.increasingOrder();
		for(int i = 0;i<7;i++)
		{
			System.out.print(arr2[i] + "->");
		}
		a.checkval();
		System.out.print( "\n\n");
		a.delNode2();
		a.Del2Child();
		
	}
}
