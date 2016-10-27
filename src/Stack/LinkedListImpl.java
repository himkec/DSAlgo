package Stack;

class Node {
	int data ;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next=null;
	}
}

public class LinkedListImpl {
	
	Node root;
	
	public boolean isEmpty(){
		if(root == null)
			return true;
		return false;
	}
	
	public void push(int data){
		if(root == null){
			root = new Node(data);
		}
		else{
			Node node = root;
			while(node.next!=null){
				node = node.next;
			}
			node.next= new Node(data);
		}
	}
	
	public int pop(){
		Node prev=root;
		int data;
		if(root == null){
			return -1;
		}
		else{
			Node node = root;
			while(node.next!=null){
				prev= node;
				node = node.next;
			}
			data = node.data;
			prev.next=null;
		}
		return data;
	}
	
	public void print(){
		Node node = root;
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String [] args){
		LinkedListImpl st = new LinkedListImpl();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.print();
		st.pop();
		st.pop();
		st.print();
		
	}
}
