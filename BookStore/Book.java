package Method;

public class Book {

    private int id;
    private int lastestId;
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.id = lastestId;
        this.lastestId = lastestId++;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", lastestId=" + lastestId + ", name=" + name + ", author=" + author + ", price=" + price + '}';
    }
}
