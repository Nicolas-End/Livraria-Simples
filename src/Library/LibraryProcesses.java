package Library;

public class LibraryProcesses {
    private User user;
    private Book book;

    public LibraryProcesses(User user, Book book){
        this.user = user;
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }
    public User getUser(){
        return this.user;
    }
}
