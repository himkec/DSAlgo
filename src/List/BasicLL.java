package List;

public class BasicLL {
	
	Node head;
	
	/*
	 * Checking first if head is null then create new node and call it head
	 * 
	 * if head is not null then navigate till node.next points to null
	 * create new node and make node.next point to node
	 * 
	 */
	public Node insert(int data){
		if (head==null){
			head=new Node(data);
		}
		else{
			Node node=head;
			while(node.next!=null){
				node=node.next;
			}
			Node elem = new Node(data);
			node.next=elem;
		}
		
		return head;
	}
	
	/*
	 * if head is null then return
	 * if head.data is to removed then make head = node.next
	 * otherwise iterate in list with two pointers current node and prev node
	 * when we find the data we make prev.next point to node.next
	 * 
	 */
	public void delete(int data){
		Node node = head;
		Node prev_node = null;
		if (head==null){
			return;
		}
		else{
			if (node.data==data){
				head=node.next;
			}else{
			while(node.data!=data){
				prev_node= node;
				node=node.next;
			}
			prev_node.next=node.next;
			}
		}
	}
	
	public void displayLL(){
		Node node = head;
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public int lengthLL(){
		int len=0;
		Node node = head;
		while(node!=null){
			len++;
			node=node.next;
		}
		
		return len;
	}
	
	/*
	 * We need three pointers to reverse linkedlist - prev , current and next
	 * 
	 * put current = head, next = current.next
	 * iterate in list and then make prev = current and current = next
	 * 
	 */
	public Node reverseLL(){
		System.out.println("Reversing LinkedList");
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current !=null){
			next = current.next;
			current.next=prev;
			prev = current;
            current = next;
		}
        return prev;
	}
	
	public void mergeSort(Node head){
		
		
	}
	
	public static Node MergeLists(Node list1, Node list2) {
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;

		  if (list1.data < list2.data) {
		    list1.next = MergeLists(list1.next, list2);
		    return list1;
		  } else {
		    list2.next = MergeLists(list2.next, list1);
		    return list2;
		  }
	}
	
	public static Node MergeListsWithout(Node list1, Node list2) {
		  BasicLL ll3 = new BasicLL();
		  Node n3=null;
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;
		  while(list1!=null && list2!=null){
			  if (list1.data < list2.data) {
				  n3=ll3.insert(list1.data);
				  list1= list1.next;
			  }
			  else{
				  n3=ll3.insert(list2.data);
				  list2= list2.next;
			  }
		  }
		  
		  if(list1!=null){
			  while(list1!=null){
				  ll3.insert(list1.data);
				  list1=list1.next;
			  }
		  }
		  
		  if(list2!=null){
			  while(list2!=null){
				  ll3.insert(list2.data);
				  list2=list2.next;
			  }
		  }
		  
		  return n3;
		 
	}
	
	public static void main(String [] args){
		BasicLL ll = new BasicLL();
		ll.insert(10);
		Node n1 = ll.insert(30);
		BasicLL ll2 = new BasicLL();
		ll2.insert(20);
		Node n2 = ll2.insert(40);
		
		//Node n3 = MergeLists(n1,n2);
		
		Node n3 = MergeListsWithout(n1,n2);
		
		while(n3!=null){
			System.out.println(n3.data);
			n3=n3.next;
		}
		
		ll2.insert(60);
		
		while(n3!=null){
			System.out.println(n3.data);
			n3=n3.next;
		}
		
		
	}
}
