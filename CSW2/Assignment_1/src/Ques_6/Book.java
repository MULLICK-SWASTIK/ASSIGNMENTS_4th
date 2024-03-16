package Ques_6;

class Book extends LibraryResource{
	
	private int pageCount;
	
	Book(String author, String title, int pageCount) {
		super(author, title);
		this.pageCount=pageCount;
	}

	@Override
	void displayDetails() {
		System.out.println("\nTitle: "+super.getTitle()+
				"\nAuthor: "+super.getAuthor()+
				"\nPage count: "+this.pageCount);
	}
	
	int getPageCount() {
		return this.pageCount;
	}
	
	void setPageCount(int pageCount) {
		this.pageCount=pageCount;
	}
	
}
