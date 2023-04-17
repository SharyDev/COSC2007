


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
		
		public int[] preorder()
		{
			int pre[] = {0,0,0,0,0};
			int count = 0;
			Node temp = root;
			Node temp2 = temp;
			boolean hold = true;
			while(hold == true)
			{
				if(temp.left !=null)
				{
					
					pre[count] = temp.data;
					temp2 = temp;
					
					count++;
					temp = temp.left;
				}
				else if(temp.left == null && temp2.right !=null)
				{
					
					pre[count] = temp.data;
					temp2 = temp.right;
					count++;
					
					
				}
				else if(temp.left == null && temp2!=temp)
				{
					pre[count] = temp2.data;
					count++;
					hold = false;
				}
			}
			hold = true;
			temp = root;
			temp2 = temp;
			while(hold == true)
			{
				if(temp.right != null)
				{
					temp = temp.right;
					pre[count] = temp.data;
					count++;
				}
				else if(temp.right == null)
				{
					hold = false;
				}
			}
			
			
			return pre;
		}
		public int[] inorder()
		{
			int inor[] = {0,0,0,0,0};
			Node temp = root;
			Node temp2 = temp;
			Node temp3 = temp;
			int count=0;
			
			boolean hold = true;
			while(hold == true)
			{
				if(temp == root)
				{
					temp = temp.left;
				}
				else if(temp!=null)
				{
					temp2 = temp;
					inor[count]=temp.data;
					count++;
					temp = temp.left;
				}
				else if(temp==null)
				{
					temp2 = temp2.right;
					inor[count] = temp2.data;
					count++;
					hold = false;
				}
			}
			
			inor[count] = root.data;
			count++;
			
			hold = true;
			temp = root.right;
			
			temp = root;
			while(hold == true)
			{
				if(temp == root)
				{
					temp = temp.right;
				}
				else if(temp!=null)
				{
					temp2 = temp;
					inor[count] = temp.data;
					count++;
					temp = temp.left;
					
				}
				else if(temp==null & temp2 != null & temp3.right != null)
				{
					temp3 = temp2.right;
					inor[count] = temp3.data;
					count++;
				}
				else if(temp == null && temp3.right==null)
				{
					hold = false;
				}
			}
			
			
			return inor;
		}
		public int[] postorder() 
		{
			int post[] = {0,0,0,0,0};
			Node temp = root;
			Node temp2 = temp;
			Node temp3 = temp;
			int count = 0;
			
			boolean hold =true;
			while(hold == true)
			{
				if(temp == root)
				{
					temp = temp.left;
				}
				else if(temp != null)
				{
					post[count] = temp.data;
					count++;
					temp2 = temp;
					temp = temp.left;
				}
				else if(temp==null && temp3!=null)
				{
					temp3 = temp2;
					temp3 = temp3.right;
					post[count] = temp3.data;
					count++;
					temp3=null;
				}
				else if(temp3 == null)
				{
					hold = false;
				}
			}
			hold = true;
			temp = root;
			temp3 = root;
			while(hold == true)
			{
				if(temp == root)
				{
					temp = temp.right;
				}
				else if(temp != null)
				{
					temp2 = temp;
					post[count] = temp.data;
					count++;
					temp = temp.left;
				}
				else if(temp == null && temp2!=null)
				{
					temp2 = temp2.right;
					temp3 = temp2;
					post[count] = temp3.data;
					count++;
					temp2 = temp3.right;
				}
				else if(temp2 == null)
				{
					hold = false;
				}
				
			}
			
			post[count] = root.data;
			
			
			return post;
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {6,1,2,7,8};
		int count = 5;
		
		Tree a = new Tree();
		for(int i=0;i<count;i++)
		{
			a.insertTree(arr[i]);
		}
		System.out.print("Order of Input:");
		for(int i = 0;i<5;i++)
		{
			System.out.print(arr[i] + "->");
		}
		System.out.print("\nPreOrder:");
		int preordr[] = a.preorder();
		System.out.print("\n");
		
		for(int i = 0;i<count;i++)
		{
			System.out.print(preordr[i] + "->");
		}
		System.out.print("\nInOrder:");
		int inorder[] = a.inorder();
		System.out.print("\n");
		
		for(int i = 0;i<count;i++)
		{
			System.out.print(inorder[i] + "->");
		}
		System.out.print("\nPostOrder: ");
		int post[] = a.postorder();
		System.out.print("\n");
		
		for(int i = 0;i<count;i++)
		{
			System.out.print(post[i] + "->");
		}
		
	}
}
