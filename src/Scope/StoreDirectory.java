package Scope;

public class StoreDirectory {
    private BookStore bookstore;
    private Market market;
    public StoreDirectory(String custId){
        bookstore = new BookStore(custId);
        market = new Market();
}
    public int getNumberOfBooks() {
        return bookstore.getNumBooks();
    }
    public int getNumberOfBookstoreEmployees() {
        return 0;
    }
    public boolean addNewEmployee(String employeeId){
        return true;
    }
    public boolean bookIsInStock(String bookId){
        return true;
    }
    public boolean addNewBook(String bookId){
        return true;
    }
    public boolean marketCarriesFoodItem(String foodItem){
        return true;
    }
}
