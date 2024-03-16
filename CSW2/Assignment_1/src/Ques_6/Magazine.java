package Ques_6;

import java.time.LocalDate;

class Magazine extends LibraryResource{
	
	private LocalDate issuDate;
	
	Magazine(String author, String title, LocalDate issueDate) {
		super(author, title);
		this.issuDate=issueDate;
	}

	@Override
	void displayDetails() {
		System.out.println("\nTitle: "+super.getTitle()+
				"\nAuthor: "+super.getAuthor()+
				"\nIssue Date: "+this.issuDate);
	}
	
	LocalDate getIssueDate() {
		return this.issuDate;
	}
	
	void setPageCount(LocalDate issueDate) {
		this.issuDate=issueDate;
	}
	
}
