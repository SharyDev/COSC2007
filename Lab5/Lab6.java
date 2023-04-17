public class Lab6 {
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
	Lab6()
	{
		root = null;
	}
	public static class Tree{
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
		
		public int[] sort()
		{
			int arr[] = {0,0,0,0,0,0,0,0,0};
			Node temp = root;
			Node temp2 = root;
			boolean hold = true;
			int count=0;
			int a=0;
			
			while(hold == true)
			{
				if(temp.left!=null && a==0)
				{
					
					temp2 = temp;
					temp = temp.left;
				}
				else if(temp.left == null && a==0)
				{
					
					arr[count] = temp.data;
					count++;
					a++;
					temp = temp2;
				}
				else if(temp.right!=null && a>0)
				{
					
						
						arr[count] = temp.data;
						count++;
						
						temp2 = temp;
						temp = temp.right;
					
					
					
				}
				else if(temp.right == null)
				{
					arr[count] = temp.data;
					count++;
					hold = false;
				}
				
			}
			temp = root;
			arr[count] = temp.data;
			count ++;
			hold = true;
			int b=0;
			while(hold == true)
			{
				if(temp.right != null && b==0)
				{
					temp=temp.right;
				}
				else if(temp.right == null)
				{
					b++;
					temp2 = temp;
					if(temp.left!=null)
					{
						temp = temp.left;
						arr[count]=temp.data;
						count++;
						if(temp.right != null)
						{
							temp = temp.right;
							arr[count] = temp.data;
							count++;
						}
						arr[count] = temp2.data;
						count++;
						hold = false;
					}
				}
			}
			
			
			
		
			return arr;
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = {45,10,7,90,12,50,13,39,57};
		
		int count = 9;
		Tree T = new Tree();
		
		for(int i=0;i<count;i++)
		{
			T.insertTree(arr[i]);
		}
		
		arr = T.sort();
		System.out.print("Sorted: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i] + "->");
			
		}
		
	}
}