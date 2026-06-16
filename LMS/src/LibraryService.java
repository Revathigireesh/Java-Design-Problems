import java.util.ArrayList;

public class LibraryService {
    private ArrayList<Book> books;
    private ArrayList<Customer> customers;
    private ArrayList<IssuedReports> issuedReports;

    LibraryService(){
        books=new ArrayList<>();
        customers=new ArrayList<>();
        issuedReports=new ArrayList<>();
    }

    //Admin features
    public void AddBooks(Customer customer,Book book) {
        if (customer.getRole().equalsIgnoreCase("Admin")) {
            books.add(book);
            System.out.println(
                    book.getTitle() +
                            " added successfully");
        }else{
            System.out.println("You dont have access to add book.");
        }
    }

    public void deleteBook(Customer customer,Book book) {
        if (customer.getRole().equalsIgnoreCase("Admin")) {
            books.remove(book);
            System.out.println(book.getTitle() + " deleted Successfully");
        }else{
            System.out.println("Sorry! you dont have access");
        }
    }

    public void updateBook(Customer customer,int book_id,String title,String author){
        if(!customer.getRole().equalsIgnoreCase("Admin")){
            System.out.println("Sorry! You don't have access");
            return;
        }

        for(Book b : books){

            if(b.getBookId() == book_id){

                b.setTitle(title);
                b.setAuthor(author);

                System.out.println(
                        "Book " + title  +" updated successfully");

                return;
            }
        }

        System.out.println("Book not found");
    }

    //User feature
    public void issueBook(int issue_id,Customer customer,Book book,int issueDate){
        if(!book.getisAvailable()){
            System.out.println("Book is not Available");
            return;
        }
        book.setAvailable(false);
        IssuedReports report =new IssuedReports( issue_id,customer,book,issueDate);
        issuedReports.add(report );
        System.out.println("Book issued successfully");
    }

    public void returnBook(int issuedId,int returnDate){
        for (IssuedReports report:issuedReports){
            if(report.getIssuedId()==issuedId){
                report.setReturnDate(returnDate);
                report.getBook().setAvailable(true);
                System.out.println("Book returned successfully");

            }
        }
    }

    public void displayBooks() {
        for (Book books : books) {
            if (books.getisAvailable()) {
                System.out.println(books.getTitle() + " " + books.getAuthor());
            }
        }
    }

    public void displayIssuedReports() {

        for(IssuedReports report : issuedReports) {
            System.out.println(report);
        }
    }
}
