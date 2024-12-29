package DSA.Practice;

public class Stack_Implementation {

    private int rear;
	private int[] arr;
	private int capacity;
	
	public Stack_Implementation(int capacity)
	{
		this.rear = -1;
		this.capacity=10;
		arr = new int[capacity];
	}
	
	//push pop peek
	public boolean push(int value)
	{
		if(size() == capacity)
		{
			return false;
		}
		else
		{
		arr[++rear] = value;
		return true;
		}
	}
	
	public int pop()
	{	
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		int value = arr[rear];
		arr[rear] = 0;
		rear--;
		System.out.println("Current Size " +size());
		return value;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		int value = arr[rear];
		System.out.println("Value at Peek =" +value);
		return value;
	}
	
	public int size()
	{
		return rear+1;
	}
	
	public boolean isEmpty()
	{
		return rear == -1;
	}
	
	public static void main(String[] args) {
	
		Stack_Implementation st = new Stack_Implementation(10);
		st.push(10);
		st.push(5);
		st.push(56);
		st.push(57);
		st.push(95);
		st.peek();
		System.out.println(st.pop());
	}
}
