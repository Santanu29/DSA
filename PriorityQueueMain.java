import java.util.*;
public class PriorityQueueMain 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		PriorityQueue pq = new PriorityQueue();

		System.out.println("Here are the list of operations that can be performed on the queue");
		System.out.println("For enqueue press 1");
		System.out.println("For dequeue press 2");
		System.out.println("For peek press 3");
		System.out.println("For size press 4");
		System.out.println("For contains press 5");
		System.out.println("For contains press 6");
		System.out.println("For printing press 7");
		System.out.println("To exit press 8");
		
		boolean continue_operation = true;
		
		do
		{
			System.out.print("Enter choice of operation : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter element to push : ");
					int input = sc.nextInt();
					pq.enqueue(input);
					break;
				}
				
				case 2: 
				{
					int val = pq.dequeue();
					System.out.println("Element popped : " + val);
					break;
				}
				
				case 3: 
				{
					int val = pq.peek();
					System.out.println("Element on top : " + val);
					break;
				}
				
				case 4: 
				{
					int currentSize = pq.getSize();
					System.out.println("Queue size : " + currentSize);
					break;
				}
				
				case 5:
				{
					System.out.println("Enter element to find : ");
					int key = sc.nextInt();
					System.out.println("Queue contains "+ key + "? : " + pq.contains(key));
					break;
				}
				
				case 6:
				{
					pq.reverse();
					System.out.println("The Priority Queue is reversed");
					break;
				}
				
				case 7:
				{				
					pq.print();
					break;
				}
				
				case 8:
				{
					continue_operation=false;
					break;
				}
				
				default: 
				{
					System.out.println("INVALID INPUT");
				}
			}
			
		} while(continue_operation);
		
		sc.close();
	}
}