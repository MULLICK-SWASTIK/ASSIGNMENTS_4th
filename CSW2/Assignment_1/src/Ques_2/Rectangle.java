package Ques_2;

public class Rectangle {
	private double length, width;
	
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	
	double getLength() {
		return this.length;
	}
	
	void setLength(double length) {
		this.length=length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	void setWidth(double width) {
		this.width=width;
	}
	
	double calcArea() {
		return this.length*this.width;
	}
	
	double calcPeri(){
		return 2*(this.length+this.width);
	}
	
	void display() {
		System.out.println("Perimeter: "+calcPeri()+"\nArea: "+calcArea());
	}
}
