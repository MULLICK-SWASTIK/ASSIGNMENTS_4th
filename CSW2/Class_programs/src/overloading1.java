
class overloading1 {
	void show(int a, float b) {
		System.out.println("int float method");
	}
	
	void show(int ... b) {
		System.out.println("float int method");
	}
	
	public static void main(String []args) {
		overloading1 t=new overloading1();
		t.show(20,3.5f);
		t.show(50,60,20,1080,5);
	}
}
