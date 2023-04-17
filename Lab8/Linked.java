
public class Linked {
	
	static class Node{
		Node right;
		Node down;
		boolean visited;
		char a;
		int val;
		Node(){
			down = null;
			right = null;
		}
	}
	static Node root;
	
	public static class tree{
		public static void insert(char a)
		{
			Node temp = root;
			boolean hold = true;
			while(hold == true)
			{
				if(temp == null)
				{
					root = new Node();
					root.a = a;
					hold=false;
					
				}
				else if(temp.down!=null)
				{
					if(a==temp.a)
					{
						hold =false;
					}
					
					temp = temp.down;
					
				}
				else if(temp.down==null)
				{
					Node temp2 = new Node();
					temp2.a = a;
					temp.down = temp2;
					hold = false;
				}
			}
			
			
		}
		public void link(char a,char b)
		{
			Node temp = root;
			boolean hold = true;
			while(hold==true)
			{
				if(temp.a != a)
				{
					temp=temp.down;
				}
				else if(temp.a==a)
				{
					boolean hold2=true;
					while(hold2==true)
					{
						if(temp.right!=null &&temp.a!=b)
						{
							temp = temp.right;
						}
						else
						{
							Node temp2 = new Node();
							temp2.a = b;
							temp.right = temp2;
							hold2 =false;
						}
					}
					hold = false;
				}
			}
			hold = true;
			temp = root;
			while(hold==true)
			{
				if(temp.a != b)
				{
					temp=temp.down;
				}
				else if(temp.a==b)
				{
					boolean hold2=true;
					while(hold2==true)
					{
						if(temp.right!=null &&temp.a!=a)
						{
							temp = temp.right;
						}
						else
						{
							Node temp2 = new Node();
							temp2.a = a;
							temp.right = temp2;
							hold2 =false;
						}
					}
					hold = false;
				}
			}
		}
		
		public void print()
		{
			Node temp = root;
			Node temp2 = root;
			boolean hold = true;
			boolean hold2  = true;
			while(hold == true)
			{
				if(temp.down!=null)
				{
					System.out.print(temp.a + "->");
					temp2=temp;
					hold2=true;
					while(hold2==true)
					{
						if(temp2.right !=null)
						{
							temp2 = temp2.right;
							System.out.print("->"+temp2.a);
						}
						else if(temp2.right == null)
						{
							
								hold2=false;
							
							
						}
					}
					
					System.out.print("\n");
					temp = temp.down;
					
				}
				else if(temp.down ==null)
				{
					System.out.print(temp.a + "->");
					temp2=temp;
					hold2=true;
					while(hold2==true)
					{
						if(temp2.right !=null)
						{
							temp2 = temp2.right;
							System.out.print(temp2.a+"->");
						}
						else if(temp2.right == null)
						{
							
								hold2=false;
							
							
						}
					}
					hold = false;
				}
						
			}
			}
		}
	
	
	public static void main(String[] args)
	{
		tree a = new tree();
		char first = 'a';
		char second = 'b';
		char third = 'c';
		a.insert(first);
		
		a.insert(second);
		a.insert(third);
		a.link(first, second);
		a.link(first, third);
		a.print();
		
	}

}
