import java.util.*;

public class PriorityQueue 
{
	Node head;
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void enqueue(int data)
	{
		Node newNode = new Node(data);
		if(head==null || data <= head.data)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			Node curr = head;
			while(curr.next!=null && curr.next.data < data)
			{
				curr = curr.next;
			}
			newNode.next = curr.next;
			curr.next = newNode;
		}
	}
	
	public int dequeue()
	{
		if(head==null)
		{
			System.out.println("Underflow! Priority Queue is empty");
			return -1;
		}
		
		int data = head.data;
		head = head.next;
		return data;
	}
	
	public int peek()
	{
		if(head == null)
		{
			System.out.println("Underflow! Priority Queue is Empty");
			return -1;
		}
		int data = head.data;
		return data;
	}
	
	public boolean contains(int key)
	{
		Node curr = head;
		while(curr!=null)
		{
			if(curr.data == key)
				return true;
		}
		return false;
	}
	
	public int getSize()
	{
		Node curr = head;
		int count =0;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public void reverse()
	{
		Node curr = head, prev=null, next=null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public ArrayList<Integer> iterator()
	{
		ArrayList<Integer> iterator = new ArrayList<>();
		Node curr = head;
		while(curr!=null)
		{
			iterator.add(curr.data);
			curr = curr.next;					
		}
		return iterator;
	}
	
	public void print()
	{
		Node curr = head;
		if(curr == null)
		{
			System.out.println("Priority Queue is empty");
			return;
		}
		System.out.println("Priority Queue : ");
		while(curr!=null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}

















