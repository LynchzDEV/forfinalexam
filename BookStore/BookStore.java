package Method;

import java.util.Arrays;

public class BookStore {

    private int id;
    private int lastestId;
    private String name;
    private Book[] books;
    private int size;

    public BookStore(String name, int size) {
        id = lastestId++;
        this.name = name;
        this.size = size;
        this.books = new Book[size];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int randomId() {
        return random(size, 0);
    }

    public int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public boolean addBook(Book book) {
        int dupCount = 0;
        int[] dupItems = new int[size];
        while (dupCount < size) {
            int rId = randomId();
            if (books[rId] == null) {
                books[rId] = book;
                return true;
            } else {
                if (dupItems[rId] == 0) {
                    dupItems[rId] = 1;
                    dupCount++;
                }
            }
        }
        return false;
    }

    public boolean sellBook(int id) {
        for (int i = 0; i < size; i++) {
          if (books[i] != null && books[i].getId() == id) {
            books[i] = null;
            return true;
          }
        }
        return false;
      }
    
      public Book[] getAllBooks() {
        Book[] temp = new Book[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
          if (books[i] != null) {
            temp[count++] = books[i];
          }
        }
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
          result[i] = temp[i];
        }
        return result;
      }
    

    @Override
    public String toString() {
        return "BookStore{" + "id=" + id + ", lastestId=" + lastestId + ", name=" + name + ", books="
                + Arrays.toString(books) + ", size=" + size + '}';
    }

}
