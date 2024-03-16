package Ques_6;

abstract class LibraryResource {
	private String author, title;
	
	LibraryResource(String author, String title){
		this.author=author;
		this.title=title;
	}
	
	String getAuthor() {
		return this.author;
	}
	
	String getTitle() {
		return this.title;
	}
	
	void setAuthor(String author) {
		this.author=author;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	
	abstract void displayDetails();
}
