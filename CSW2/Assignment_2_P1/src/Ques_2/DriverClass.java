package Ques_2;
public class DriverClass {
    public static void main(String[]args){
        Book b1=new Book("5sd4f5","Sea of Deceits",210);
        Book b2=new Book("65asd5","Carlos & Benne",350);
        System.out.println(b1+"\n"+b2);
        System.out.println("\nDo they have same price? \n"+b1.equals(b2));
    }
}
//OUTPUT:
// Book name: Sea of Deceits       Book ID: 5sd4f5         Price: 210
// Book name: Carlos & Benne       Book ID: 65asd5         Price: 350

// Do they have same price?
// false