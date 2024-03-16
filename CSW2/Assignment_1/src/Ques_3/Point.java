package Ques_3;

public class Point {
	int x, y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	Point(Point c){
		this.x=c.x;
		this.y=c.y;
	}
	
	int getX() {
		return this.x;
	}
	
	int getY(){
		return this.y;
	}
	
	void setX(int x) {
		this.x=x;
	}
	
	void setY(int y) {
		this.y=y;
	}
	
}
