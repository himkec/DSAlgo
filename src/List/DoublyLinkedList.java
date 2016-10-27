package List;

public class DoublyLinkedList {
	
	DNode head;
	
	public void insert(int data){
		if(head==null){
			head = new DNode(data);
		}
		else{
			DNode node = head;
			while(node.next!=null){
				node = node.next;
			}
			DNode elem = new DNode(data);
			node.next=elem;
			elem.prev=node;
		}
	}
	
	public void reverse(){
		if(head == null){
			System.out.println("Head is null");
		}
		else{
			while(head.next!=null){
				head=head.next;
			}
		}
	}
	
	public void displayLL(){
		DNode node = head;
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String [] args){
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.displayLL();
		dl.reverse();
		dl.displayLL();

	}
}
