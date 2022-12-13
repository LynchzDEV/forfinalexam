package com.mycompany.bookstore;

import java.util.Arrays;

public class BookStore {

    private int id;
    private static int latestId;
    private String name;
    private Book[] books;
    private int size;

    public BookStore(String name, int size) {
        this.id = latestId++;
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addBook(Book book) {
        int duplicateCount = 0;
        int[] duplicateItems = new int[size];
        while (duplicateCount < size) {
            int random_Id = randomId();
            if (books[random_Id] == null) {
                books[random_Id] = book;
                return true;
            } else {
                if (duplicateItems[random_Id] == 0) {
                    duplicateItems[random_Id] = 1;
                    duplicateCount++;
                }
            }
        }
        return false;
    }

    private int randomId() {
        return random(size, 0);
    }

    private int random(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public boolean sellBook(int id){
        for(int i = 0;i<size;i++){
            if(books[i].getId() == id){
            books[i] = null;
            return true;
            }
        }   
        return false;
    }
    
    public Book[] getAllBooks(){
        Book[] new_array = new Book[size];
        for(int i=0,k=0; i< size;i++){
            if(books[i] != null){
                new_array[k++] = books[i];
            }
        }
        books = new_array;
        return books;
    }

    @Override
    public String toString() {
        return "BookStore{" + "id=" + id + ", name=" + name + ", books=" + books + ", size=" + size + '}';
    }
    
    
}
