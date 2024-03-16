package Ques_6;

import java.time.LocalTime;

class DVD extends LibraryResource{
	
	private LocalTime duration;
	
	DVD(String author, String title, LocalTime duration) {
		super(author, title);
		this.duration=duration;
	}
	
	LocalTime getDuration() {
		return this.duration;
	}
	
	void setDuration(LocalTime duration) {
		this.duration=duration;
	}

	@Override
	void displayDetails() {
		System.out.println("\nTitle: "+super.getTitle()+
				"\nCreator: "+super.getAuthor()+
				"\nDuration: "+this.duration);
	}

}
