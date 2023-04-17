
public class Queue {
	static public class Node{
		int data;
		Node back;
		Node next;
		int num1;
		
		Node(){
			back = null;
			next = null;
			num1=0;
		}
		Node(int data){
			data = this.data;
			back = null;
			next = null;
		}
		
	}
	static Node Head;
	
	static Node root;
	Queue()
	{
		root = null;
	}
	static int counter = -1;
	
	public static class Imp{
		public void insert(int data)
		{
			Boolean hold = true;
			Node temp = root;
			Node temp2 = new Node();
			temp2.data = data;
				while(hold == true)
				{
					if(root ==null)
					{
						root = temp2;
						
						counter++;
						root.num1 = counter;
						hold = false;
						
					}
					else if(temp.next != null)
					{
						temp = temp.next;
					}
					else if(temp.next ==null)
					{
						temp.next = temp2;
						temp2.back = temp;
						counter++;
						temp2.num1 = counter;
						Head = temp2;
						hold = false;
					}
				
				}
		
				
		}
		
		public void peek()
		{
			Node temp = root;
			int num=0;
			while(num !=counter)
			{
				num++;
				temp = temp.next;
			}
			System.out.println("Peek: " + temp.data);
		}
		
		public void poll()
		{
			Node temp = root;
			int num = 0;
			while(num != counter)
			{
				num++;
				temp = temp.next;
			}
			System.out.println("Pool: " + temp.data);
			temp = temp.back;
			temp.next = null;
			counter--;
		}
		
		public void Display()
		{
			Node temp = root;
			System.out.print("Elements: ");
			while(temp!=null)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
		}
		public void changePri(int pi,int cha)
		{
			
			Node temp2 = root;
			Node temp3 = root;
			Node temp = root;
			Node temp4 = root;
			Node temp5 = new Node();
			
			while(temp.num1 != pi)
			{
				temp = temp.next;
			}
			
			temp2 = temp.back;
			temp3 = temp.next;
			temp2.next = temp3;
			while(temp4.next!= null)
			{
				temp4 = temp4.next;
			}
			temp5.data= temp.data;
			temp5.num1 = cha;
			temp4.next = temp5;
			temp=null;
			
			
			
			
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {45,20,14,12,31,7,11,13,7};
		
		Imp T = new Imp();
		for(int i=0;i<9;i++)
		{
			T.insert(arr[i]);
		}
		T.Display();
		System.out.println("\nNode with Max Priority\n");
		T.peek();
		T.poll();
		T.Display();
		T.changePri(2, 49);
		System.out.print("\nAfter Changing Priority\n");
		T.Display();
	}
	
	
	
}
