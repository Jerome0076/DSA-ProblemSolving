package DSA.Practice;

public class CircularQueue {
	private int front;
    private int rear;
    private int[] q;
    private int capacity;
    private int size;

    public CircularQueue(){
        this.front=-1;
        this.rear=-1;
        this.size=0;
        this.capacity=10;
        q= new int[capacity];
    }
    public CircularQueue(int capacity){
        this.front=-1;
        this.rear=-1;
        this.size=0;
        this.capacity=capacity;
        q= new int[capacity];
    }
    // it adds up the element to queue
    public void enqueue(int item){
		//size less than  capacity
		//first time if we are enqueue
		if(front==-1)
		{
			front=0;
			rear=0;
			q[rear]=item;
			size++;
		}
		else if(size<capacity) {
			rear++;
			q[rear]=item;
			size++;
		}
		else System.out.println("size exceeded");
	}
	// it removes the element from queue
	public void dequeue(){
		//size decrement
		//isempty
		//one element
		//front ++
		if(isEmpty()) {
			System.out.println("Queue is empty..");
		}
		else if(size==1)
		{
			q[front]=0;
			front=-1;
			rear=-1;
			size--;
		}
		else {
		q[front]=0;
		front++;
		size--;
		}
	}
    // it returns the element at top
    public int peek(){
        if(isEmpty()) System.out.println("Queue is empty..");
        return q[front];
    }
    // it returns the element at top and delete it
    public int poll(){
        if(isEmpty()) {
            System.out.println("Queue is empty.. returning with garbage value");
            return Integer.MIN_VALUE;
        }
        int ele = q[front];
        q[front]=0;
        front++;
        size--;
        return ele;
    }
 // this returns the number of elements present inside the queue
    public int getSize() {
        return size;
    }
    public boolean isFull(){
        return size==capacity;
    }

    //5 (0,1,2,3,4,5)

    public boolean isEmpty(){
       // return size==0;
        return front==-1;
    }

    public static void main(String[] args) {

        SimpleQueue simpleQueue = new SimpleQueue(5);
        System.out.println("Simple Queue");
//        Queue<Integer> integers = new LinkedList<>();
//        ArrayDeque<Integer> q = new ArrayDeque<>();
//        integers.pe
        System.out.println(simpleQueue.getSize());
        simpleQueue.enqueue(3);
        simpleQueue.enqueue(3);
        System.out.println(simpleQueue.getSize());
        simpleQueue.enqueue(3);
        System.out.println(simpleQueue.getSize());
        simpleQueue.enqueue(0);
        System.out.println(simpleQueue.getSize());
        
        CircularQueue cqueue = new CircularQueue(5);
        
    }
}

