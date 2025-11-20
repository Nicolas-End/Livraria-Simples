package Library;
import java.util.Random;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(String bookTitle, String bookAuthor){
        Random rand = new Random();
        this.title = bookTitle;
        this.author = bookAuthor;
        this.available = true;
    }

     public String getTitle(){
        return this.title;
     }
     public void setTitle(String newTitle){
        this.title = newTitle;
     }

     public String getAuthor(){
        return this.author;
     }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean newStatus){
        this.available = newStatus;
    }
    public boolean getAvailable(){
        return  this.available;
    }
}
