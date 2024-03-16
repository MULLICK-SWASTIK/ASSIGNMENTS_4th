package Ques_2;
public class Book {
    int price;
    String bookId, bookName;
    
    public Book(String bookId, String bookName, int price){
        this.bookId=bookId;
        this.bookName=bookName;
        this.price = price;
    }

    public String toString(){
        return "Book name: "+this.bookName+"\tBook ID: "+this.bookId+"\t\tPrice: "+this.price;
    }

    public  boolean equals(Book b) {
        return this.price==b.price;
    }

}
