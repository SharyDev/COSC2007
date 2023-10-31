/*
 Course Name: COSC2007P(LAB) - Data Structures II (23W)
 Name: Shahroz Abbas

 */

public class Assignment1 {
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode pre;
		
		public ListNode(int data)
		{
			this.data = data;
		}
		public ListNode()
		{
		}
	}
	
	private ListNode head;
	private ListNode tail;
	private int count;
	
	public Assignment1() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	public boolean isEmpty() {
		if(count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			ListNode current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
			newNode.pre = current;
		}
		count++;
	}
	
	public void Print()
	{
		ListNode current = new ListNode();
		current = head;
		while(current != null)
		{
			System.out.print(current.data+"->");
			current = current.next;
		}
		
	}
	
	public void insertMid(int val,int data)
	{
		//val is used to find the node, the node will be inserted after finding the value in linked list
		ListNode current = new ListNode();
		ListNode newNode = new ListNode(data);
		current = head;
		while(current.data != val)
		{
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		newNode.pre = current;
		
	}
	
	public void insertFirst(int data)
	{
		ListNode current = new ListNode(data);
		head.pre = current;
		current.next = head;
		head = current;
		
	}
	
	public void deleteNode(int data)
	{
		ListNode current = new ListNode();
		current = head;
		while(current.data != data)
		{
			current = current.next;
		}
		ListNode preNode = new ListNode();
		ListNode forwardNode = new ListNode();
		preNode = current.pre;
		preNode.next = current.next;
		forwardNode = current.next;
		forwardNode.pre = preNode;
		current.pre = null;
		current.next = null;
		current = null;
		
	}
	
	
	public static void main(String[] args)
	{
		Assignment1 Doubly = new Assignment1();
		
		for(int i=0;i<10;i++)
		{
			Doubly.insertLast(i+1);
		}
		
		//Insert Node at Mid first parameter is location, 2nd is data to insert
		Doubly.insertMid(3, 3);
		
		//Insert Node at Last
		Doubly.insertLast(22);
		
		//Insert At First
		Doubly.insertFirst(55);
		
		//Delete Node in middle
		Doubly.deleteNode(3);
		
		//Display the Items of all Nodes
		Doubly.Print();
	}
	
}
