package Scope;

public class BookStore {
    private static final int DEFAULT_NO_OF_EMPLOYEES = 50;
    private static final int DEFAULT_NO_OF_BOOKS = 250;
    private String id = null;
    private Book[] books;
    private Employee[] employees;

    public BookStore(String theId) {
        id = theId;
        books = new Book[DEFAULT_NO_OF_BOOKS];
        employees = new Employee[DEFAULT_NO_OF_EMPLOYEES];
}
    public int getNumBooks() {
        int i = 0;
        for (i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
        }
        return i;
    }

    public int getNumEmployees() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                count++;
        }
        return count;
    }

    public boolean addNewBook2(String bookId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(bookId);
                return true;
            }
        }
        throw new RuntimeException("The array is full");
    }

    public void addNewBook(String bookId) {
        int i = 0;
        for (i = 0; i < books.length; i++) {
            if (books[i] == null)//
                break;
        }
        if (i == books.length) // the array is full, cannot add
            throw new RuntimeException("The array is full.");
        else
            books[i] = new Book(bookId); // add successfully

    }

    public void printTheBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.print(books[i].getId() + " ");
            else
                System.out.print("null" + " ");
        }
        System.out.println();
    }

    public boolean addNewEmployee(String employeeId) {
        Employee e = new Employee(employeeId);
        int i = 0;
        for (i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                break;
        }
        if (i >= 0 && i < employees.length) {
            employees[i] = e;
            return true;
        } else
            return false;
    }

    public boolean bookIsInStock(String bookId) {
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b != null && b.getId().equals(bookId))
                return true;
        }
        return false;
    }

}
