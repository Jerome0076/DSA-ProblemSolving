package DSA.Practice;

public class CircularQueue_622 {

	int[] arr;
	int front = -1;
    int rear = -1;
    int size = 0;
    int k;
    
	public CircularQueue_622(int k) {
        arr = new int[k];
//        this.k = k;
    }
    
    public boolean enQueue(int value) {
        //if adding value to empty
    	if(isFull())
    	{
    		return false;
    	}
    	else if (front==-1)
    	{
	    	front = 0;
	    	rear = 0;
	    	arr[rear] = value;
	    	size++;
	    	return true;
    	}
    	else if(size<k)
    	{
    		rear = rear % k;
			arr[rear]=value;
			size++;
			return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
    
    public boolean deQueue() {
    	boolean flag = false;
        if(isEmpty())
        {
        	flag = false;
        }
        if(front==rear){
            arr[front]=0;
            size--;
            rear=-1;
            front=-1;
            flag = true;
        }else {
            arr[front]=0;
            front=(front+1)%k;
            size--;
            flag = true;
        }

        return flag;
    }
    
    public int Front() {
        return arr[front];
    }
    
    public int Rear() {
    	return arr[rear];
    }
    
    public boolean isEmpty() {
        if (size==0)
        {
        	return true;
        }
        else 
        {
        	return false;
        }
    }
    
    public boolean isFull() {
        if(size == k)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
	

