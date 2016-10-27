package Queue;

public class ArrayImpl {
	
	private int head;
	private int tail;
	private int [] queue;
	
	public ArrayImpl(int size){
		queue = new int [size] ;
		head=tail=-1;
	}
	
	public boolean isQueueFull(){
		if (tail == queue.length -1){
			return true;
		}
		return false;
	}
	
	public boolean isQueueEmpty(){
		if (tail == -1){
			return true;
		}
		return false;
	}
	
	public void enqueue(int data){
		if(isQueueFull()){
			try {
				throw new Exception("Queue is Full");
			} catch (Exception e) {
				System.out.println("Queue is Full");
			}
		}else{
			queue[++tail] = data;
			
		}
	}
	
	public int dequeue(){
		int data=0;
		if(isQueueEmpty()){
			try {
				throw new Exception("Queue is Empty");
			} catch (Exception e) {
				System.out.println("Queue is Empty");
			}
		}else{
			data = queue[head+1];
			head++;
		}
		return data;
	}
	
	public void print(){
		int i = head;
		while(i < tail){
			System.out.println(queue[i+1]);
			i++;
		}
	}
	
	public static void main(String [] args){
		ArrayImpl al = new ArrayImpl(5);
		al.enqueue(10);
		al.enqueue(20);
		al.enqueue(30);
		al.enqueue(40);
		al.print();
		al.dequeue();
		al.print();
		al.enqueue(50);
		al.enqueue(60);
		al.print();
		
	}

}
