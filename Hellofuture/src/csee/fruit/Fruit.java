package csee.fruit;

import java.util.Comparator;

public class Fruit {
	// 필드 
	int no;
	String name;
	int price;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[no=" + no + ", " + "name=" + name + ", prcie=" + price + "]";

	}
	
	
}

class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class FruitComparatorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}

