package ObjectSorting;

public class ObjectComparision {
	
	String name;
	
	public ObjectComparision(String name) {
		this.name = name;
	}
	
	public boolean equals(ObjectComparision o){
		
		if (name.equals(o.name)){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		ObjectComparision obj1 = new ObjectComparision("Himanshu");
		ObjectComparision obj2 = new ObjectComparision("Himanshu");
		
		System.out.println(obj1.equals(obj2));
	}

}
