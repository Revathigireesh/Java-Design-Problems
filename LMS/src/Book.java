public class Book {
    private  int bookId;
    private String  title;
    private String author;
    private boolean isAvailable;

    Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean availability){
        this.isAvailable=availability;
    }

    @Override
    public String toString(){
        return "Book Id: " + bookId +
               "Book Title: " + title +
                "Author: " + author +
                ",Available: " + isAvailable;
    }
}
