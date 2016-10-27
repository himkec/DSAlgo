package ObjectSorting;

import java.util.Arrays;

public class Fruit implements Comparable<Fruit>{
	
	private String fruit_name;
	private String fruit_desc;
	private int quantity;

	public Fruit(String fruit_name, String fruit_desc, int quantity) {
		this.fruit_name = fruit_name;
		this.fruit_desc = fruit_desc;
		this.quantity = quantity;
	}

	public String getFruit_name() {
		return fruit_name;
	}

	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public String getFruit_desc() {
		return fruit_desc;
	}

	public void setFruit_desc(String fruit_desc) {
		this.fruit_desc = fruit_desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int compareTo(Fruit fruit) {
		//int compareQuantity = ((Fruit) fruit).getQuantity();

		//ascending order
		//return this.quantity - compareQuantity;
		
		String compareName = ((Fruit) fruit).getFruit_name();

		//ascending order
		return this.fruit_name.compareTo(compareName);
	}

	public static void main(String args[]){

		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70);
		Fruit apple = new Fruit("Apple", "Apple description",100);
		Fruit orange = new Fruit("Orange", "Orange description",80);
		Fruit banana = new Fruit("Banana", "Banana description",90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		Arrays.sort(fruits);

		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruit_name() +
			", Quantity : " + temp.getQuantity());
		}
		
		System.gc();
	}
}
