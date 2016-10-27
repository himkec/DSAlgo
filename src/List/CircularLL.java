package List;

public class CircularLL {
	
	Node head;
	
	/*
	 * Checking first if head is null then create new node and call it head
	 * and make head.next point to head (circular)
	 * 
	 * if head is not null then navigate till node.next points to head
	 * create new node and make node.next point to new_node and new_node point to head
	 * 
	 */
	public void insert(int data){
		if (head==null){
			head=new Node(data);
			head.next=head;
		}
		else{
			Node node=head;
			while(node.next!=head){
				node=node.next;
			}
			Node elem = new Node(data);
			node.next=elem;
			elem.next=head;
		}
	}
	
	public void print(){
		Node node = head;
		while(node.next!=head){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main(String [] args){
		CircularLL cll = new CircularLL();
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.print();
		
	}

}
