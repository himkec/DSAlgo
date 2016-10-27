package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackMin {
	
	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();
	public void Push(int data){
		st1.push(data);
		if(st2.isEmpty() || data <= st2.peek()){
			st2.push(data);
		}
		else{
			st2.push(st2.peek());
		}
	}
	
	public void Pop(){
			if(!st1.isEmpty())
			System.out.println(st1.pop());;
			if(!st2.isEmpty())
			st2.pop();
			
	}
	
	public void getMin(){
		
		if(!st2.isEmpty()){
			 System.out.println(st2.peek());
		}
		
	}
	
	public void printAux(){
		System.out.println(Arrays.toString(st2.toArray()));
	}
	
	public void print(){
		System.out.println(Arrays.toString(st1.toArray()));
	}
	
	public static void main(String [] args){
		StackMin st = new StackMin();
		st.Push(10);
		st.Push(20);
		st.Push(5);
		st.Push(30);
		st.printAux();
		st.print();
		st.getMin();
		//st.getMin();
		st.Pop();
		st.printAux();
		st.print();
		//st.getMin();
	}
	
}
