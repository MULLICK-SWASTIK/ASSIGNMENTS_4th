package Ques_1;

public class Car {
	
	private String make, model;
	
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
	
	public String getMake() {
		return this.make;
	}
	
	void setMake(String make) {
		this.make=make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	void setModel(String model) {
		this.model=model;
	}
	
}
