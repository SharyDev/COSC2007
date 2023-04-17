
public class Lab {
	static public class Node{
		int data;
		Node left;
		Node right;
		
		Node(){
			left = null;
			right = null;
		}
		Node(int data){
			data = this.data;
			left = null;
			right = null;
		}	
	}
	static Node root;
	Lab()
	{
		root = null;
	}
	
	static int rootlevel = 0;

	public static class Tree{
		public void insertTree(int data)
		{
			if(root == null)
			{
				root = new Node();
				root.data = data;
				rootlevel++;
			}
			else if(root != null)
			{
				Node temp = root;
				
				boolean hold = true;
				Node temp2 = new Node();
				temp2.data = data;
				
				while(hold == true)
				{
					if(rootlevel==1)
					{
						temp.left = temp2;
						rootlevel++;
						hold = false;
					}
					else if(rootlevel == 2)
					{
						temp.right = temp2;
						rootlevel++;
						hold = false;
						
					}
					else if(rootlevel==3)
					{
						temp=temp.left;
						temp.left = temp2;
						rootlevel++;
						hold = false;
					}
					else if(rootlevel==4)
					{
						temp = temp.left;
						temp.right = temp2;
						rootlevel++;
						hold = false;
					}
					else if(rootlevel==5)
					{
						temp= temp.right;
						temp.left = temp2;
						rootlevel++;
						hold = false;
					}
					else if(rootlevel==6)
					{
						temp =temp.right;
						temp.right = temp2;
						rootlevel++;
						hold = false;
					}
					
				}
				
				
				
				
			}
		
				
		}
		
		public void print()
		{
			int arr[] = {0,0,0,0,0,0,0};
			Node temp = root;
			boolean hold = true;
			Node temp2 = root;
			int count=0;
			int a= 0;
			
			while(hold == true)
			{
				if(temp.left !=null && a==0)
				{
					temp2 = temp;
					temp = temp.left;
					
				}
				else if(temp.left ==null)
				{
					
					arr[count] = temp.data;
					count++;
					temp = temp2;
					a++;
					
				}
				else if(temp == temp2)
				{
					arr[count] = temp.data;
					count++;
					if(temp.right !=null)
					{
						temp2 = temp.right;
					}
					arr[count] = temp2.data;
					count++;
					hold = false;
				}
				
				
			}
			
			temp = root;
			temp2 = root;
			arr[count] = temp.data;
			count++;
			
			hold = true;
			a=0;
			while(hold == true)
			{
				if(temp.right !=null && a==0)
				{
				
					
					if(temp.left !=null && temp !=root)
					{
						arr[count] = temp.data;
						count++;
						temp2 = temp.left;
						arr[count] = temp2.data;
						count++;
					}
					temp2 = temp;
					temp = temp.right;
					
				}
				else if(temp.right == null )
				{
					a++;
					arr[count] = temp.data;
					count++;
					hold = false;
				}
				
				
			}
			System.out.print("{");
			for(int i = 0;i<7;i++)
			{
				System.out.print(","+arr[i]);
			}
			System.out.print("}");
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = {6,4,8,3,5,7,9};
		int count = 7;
		Tree T = new Tree();
		for(int i=0;i<count;i++)
		{
			T.insertTree(arr[i]);
		}
		
		T.print();
		
	}
}
