package Stack;

public class ArrayImpl {
	
	private int top;
	private int [] stack;
	
	public ArrayImpl(int size){
		stack = new int [size];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		if(top == stack.length-1)
			return true;
		return false;
	}
	
	public void push(int data){
		if(isFull()){
			try {
				throw new Exception("Stack is full");
			} catch (Exception e) {
				System.out.println("Stack full exception");
			}
		}
		else{
			stack[++top] = data;
		}	
		
	}
	
	public void pop(){
		if(isEmpty()){
			try {
				throw new Exception("Stack is empty");
			} catch (Exception e) {
				System.out.println("Stack empty exception");
			}
		}
		else{
			int data = stack[top];
			System.out.println("Item pop : " + data);
			top--;
			
		}	
		
	}
	
	public void print(){
		int i = top;
		while(i>=0){
			System.out.println(stack[i]);
			i--;
		}
	}
	
	public static void main(String [] args){
		ArrayImpl st = new ArrayImpl(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.print();
		st.pop();
		st.print();
		st.push(50);
		st.push(50);
		st.push(50);
		st.print();
	}

}
