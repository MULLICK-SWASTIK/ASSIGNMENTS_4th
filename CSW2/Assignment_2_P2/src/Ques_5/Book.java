package Ques_5;

class Book {
    int book_id, book_quantity;
    String book_name, author;

    public Book(String book_name, int book_id, String author, int book_quantity) {
        this.book_name = book_name;
        this.book_id = book_id;
        this.author = author;
        this.book_quantity = book_quantity;
    }

    public String toString() {
        return "Name: " + this.book_name + "\t ID: " + this.book_id + " \t Author: " + this.author + " \t Quantity: "
                + this.book_quantity;
    }

}
