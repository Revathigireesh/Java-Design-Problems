public class IssuedReports {
    private int issuedId;
    private Customer customer;
    private Book book;
    private int issueDate;
    private int returnDate;

    public IssuedReports(int issuedId,Customer customer,Book book,int issueDate){
        this.issuedId=issuedId;
        this.customer=customer;
        this.book=book;
        this.issueDate=issueDate;
    }

    public int getIssuedId() {
        return issuedId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {

        return "Issue ID : " + issuedId +
                ", Customer : " + customer.getCustomerName() +
                ", Book : " + book.getTitle() +
                ", Issue Date : " + issueDate +
                ", Return Date : " + returnDate;
    }
}
