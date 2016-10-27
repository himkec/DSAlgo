package Queue;

import java.util.NoSuchElementException;

public class ArrayImplementation {
	private Object[] array;
	private int size = 0;
	private int head = 0; // index of the current front item, if one exists
	private int tail = 0; // index of next item to be added

	public ArrayImplementation(int capacity) {
		array = new Object[capacity];
	}

	public void enqueue(Object item) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full queue");
		}
		array[tail] = item;
		tail = (tail + 1) ;
		size++;
	}

	public Object dequeue() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot remove from empty queue");
		}
		Object item = array[head];
		array[head] = null;
		head = (head + 1) ;
		size--;
		tail--;
		return item;
	}

	public Object peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek into empty queue");
		}
		return array[head];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	
	public void displayQueue(){
		for (int i=head;i< tail ; i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		
			ArrayImplementation q = new ArrayImplementation(4);
		    q.enqueue("A");
		    q.enqueue("B");
		    q.enqueue("C");
		    q.enqueue("D");
		    System.out.println("After enqueue");
		    System.out.println("size : " + q.size());
		    System.out.println("tail : " + q.tail);
		    q.displayQueue();
		    
		    q.dequeue();
		    System.out.println("After dequeue");
		    System.out.println("size : " + q.size());
		    System.out.println("tail : " + q.tail);
		    q.displayQueue();
		    
		    q.dequeue();
		    System.out.println("After dequeue");
		    System.out.println("size : " + q.size());
		    System.out.println("tail : " + q.tail);
		    q.displayQueue();
		    
		    q.enqueue("D");
		    System.out.println("After enqueue");
		    System.out.println("size : " + q.size());
		    System.out.println("tail : " + q.tail);
		    q.displayQueue();
		   // q.enqueue("E");
		    //q.enqueue("F");
		    //System.out.println("After enqueue");
		   // q.displayQueue();
		    
		    System.out.println("After peek");
		    System.out.println(q.peek());
		    System.out.println("tail : " + q.tail);
		    q.displayQueue();
		   // q.enqueue("A");
		    //q.enqueue("B");
		   // q.enqueue("C");
	}
}
