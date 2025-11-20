package Library;

import java.util.ArrayList;
import java.util.Random;
public class User {
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks;

    public User(String userName){
        Random rand = new Random();
        this.name = userName;
        this.id = rand.nextInt(100);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addNewBorrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    public void removeABorrowedBook(Book book){
        this.borrowedBooks.remove(book);
    }
}
