package Parte_b.clasesejercicio1anteriores;

public class Book {
    private final String isbn;
    private final String name;
    private final Author author;
    private double price;
    private int qty;

    public Book(String isbn, String name, Author author, double price){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=0;
    }
    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.author = author;
        this.price=price;
        this.qty=qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return "Book[isbn="+isbn+",name="+name+",Author="+ author.toString() +",price="+price+",qty="+qty+"]";
    }
}
