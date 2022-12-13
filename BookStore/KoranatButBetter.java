package simpleos.koranatbutbetter;

import Method.*;

public class KoranatButBetter {

    public static void main(String[] args) {
        testBookStore();
    }

    public static void testBookStore() {
        BookStore bs = new BookStore("test", 3);
        Book book1 = new Book("testBook1", "me", 500);
        Book book2 = new Book("testBook2", "notme", 400);
        System.out.println(book1.getId());
        System.out.println(book2.getId());
        bs.addBook(book1);
        bs.addBook(book2);
        System.out.println(bs);
    }

    public static void testTest() {
        test t = new test();
    }
}
