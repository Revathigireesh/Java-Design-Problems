public class Main {
    public static void main(String[] args) {

        Customer pooja = new Customer(1,"pooja","p@gmail.com","user");
        Customer revathi = new Customer(2,"revathi","r@gmail.com","Admin");

        Book book1 = new Book(1,"Java","rev");
        Book book2 = new Book(2,"c++","john");

        LibraryService libraryService=new LibraryService();
        libraryService.AddBooks(revathi,book1); //have access
        libraryService.AddBooks(pooja,book2); //no access
        libraryService.AddBooks(revathi,book2);
        libraryService.issueBook(1,pooja,book1,12); //success
        libraryService.displayBooks(); //succcess
        libraryService.displayIssuedReports();
        libraryService.deleteBook(pooja,book2); //no access
        libraryService.deleteBook(revathi,book1);
        libraryService.updateBook(revathi,2,"Python","johny merry");
    }
}