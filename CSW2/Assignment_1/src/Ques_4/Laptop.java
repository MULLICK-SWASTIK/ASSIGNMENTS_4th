package Ques_4;

public class Laptop {
	private String model;
	private long price;
	
	void setModel(String model) {
		this.model=model;
	}
	
	void setPrice(long price) {
		this.price=price;
	}
	
	public String toString() {
		return "{"+this.model+", "+this.price+"}";
	}
}
