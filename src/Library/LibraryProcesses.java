package Library;

import java.util.Scanner;

public class LibraryProcesses {
    private User user;
    private Book book;

    public LibraryProcesses(User user, Book book){
        this.user = user;
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    public void addBorrowBook(){
        this.user.addNewBorrowBook(this.book);
        book.setAvailable(false);
        System.out.printf("\nO livro %s esta sendo emprestado para o usuario %s",this.book.getTitle(),this.user.getName());
    }

    public void removeBorrowBook(){
        this.user.removeABorrowedBook(this.book);
        book.setAvailable(true);
        System.out.printf("\nO livro %s está disponivel",this.getBook().getTitle());
    }
}
